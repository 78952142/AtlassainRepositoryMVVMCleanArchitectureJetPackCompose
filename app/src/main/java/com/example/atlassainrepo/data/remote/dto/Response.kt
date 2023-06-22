package com.example.atlassainrepo.data.remote.dto

data class Response(
    val next: String,
    val pagelen: Int,
    val values: List<Value>
)