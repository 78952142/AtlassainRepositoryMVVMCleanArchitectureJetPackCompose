package com.example.atlassainrepo.data.mappers

import com.example.atlassainrepo.data.remote.dto.Value
import com.example.atlassainrepo.domain.model.BitbucketRepoList


fun Value.toMapRepo(): BitbucketRepoList {
    return BitbucketRepoList(
        full_name = full_name,
        owner = owner
    )
}