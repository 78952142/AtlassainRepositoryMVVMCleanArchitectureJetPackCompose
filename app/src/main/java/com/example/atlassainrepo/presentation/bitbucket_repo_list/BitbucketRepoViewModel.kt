package com.example.atlassainrepo.presentation.bitbucket_repo_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.atlassainrepo.common.Resource
import com.example.atlassainrepo.domain.usecase.BitbucketUseCase
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class BitbucketRepoViewModel @Inject constructor(
    private val bitbucketUseCase: BitbucketUseCase
) : ViewModel() {
    private val _state = mutableStateOf(BitbucketRepoState())
    val state: State<BitbucketRepoState> = _state

    init {
        getBitbucketRepository()
    }

    private fun getBitbucketRepository() {
        bitbucketUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = BitbucketRepoState(repoList = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value =
                        BitbucketRepoState(error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = BitbucketRepoState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}
