package com.example.atlassainrepo.data.remote.dto

data class Links(
    val avatar: Avatar,
    val branches: Branches,
    val clone: List<Clone>,
    val commits: Commits,
    val downloads: Downloads,
    val forks: Forks,
    val hooks: Hooks,
    val html: Html,
    val issues: Issues,
    val pullrequests: Pullrequests,
    val self: Self,
    val source: Source,
    val tags: Tags,
    val watchers: Watchers
)