package com.example.atlassainrepo.domain.repository

import com.example.atlassainrepo.data.remote.dto.Respocse


interface BitbucketRepository {

    suspend fun getBitbucketRepositoryList(): Respocse
}