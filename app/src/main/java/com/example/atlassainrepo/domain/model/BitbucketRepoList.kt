package com.example.atlassainrepo.domain.model


import com.example.atlassainrepo.data.remote.dto.Owner

data class BitbucketRepoList(
    val full_name: String,
    val owner: Owner
    )
