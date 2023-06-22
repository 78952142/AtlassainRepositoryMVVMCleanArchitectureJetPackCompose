package com.example.atlassainrepo.presentation.bitbucket_repo_list

import com.example.atlassainrepo.domain.model.BitbucketRepoList

data class BitbucketRepoState (
    val isLoading : Boolean = false,
    val repoList : List<BitbucketRepoList> = emptyList(),
    val error: String = ""
)
