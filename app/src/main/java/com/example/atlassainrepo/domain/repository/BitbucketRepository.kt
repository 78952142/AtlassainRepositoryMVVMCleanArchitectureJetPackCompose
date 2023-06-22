package com.example.atlassainrepo.domain.repository

import com.example.atlassainrepo.data.remote.dto.Response


interface BitbucketRepository {

    suspend fun getBitbucketRepositoryList(): Response
}