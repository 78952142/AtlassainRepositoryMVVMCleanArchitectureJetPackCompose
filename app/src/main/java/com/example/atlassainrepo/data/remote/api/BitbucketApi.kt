package com.example.atlassainrepo.data.remote.api

import com.example.atlassainrepo.data.remote.dto.Respocse
import com.example.atlassainrepo.data.remote.dto.Value
import retrofit2.http.GET

interface BitbucketApi {

    @GET("2.0/repositories")
    suspend fun getRepositoryApi(): Respocse
}
