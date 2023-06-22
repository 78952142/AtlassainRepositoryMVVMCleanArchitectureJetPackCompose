package com.example.atlassainrepo.data.repository

import com.example.atlassainrepo.data.remote.api.BitbucketApi
import com.example.atlassainrepo.data.remote.dto.Response

import com.example.atlassainrepo.domain.repository.BitbucketRepository
import javax.inject.Inject


class BitbucketRepositoryImpl  @Inject constructor(
    private val bitbucketApi: BitbucketApi
) : BitbucketRepository {

    override suspend fun getBitbucketRepositoryList(): Response {
       return bitbucketApi.getRepositoryApi()
    }
}