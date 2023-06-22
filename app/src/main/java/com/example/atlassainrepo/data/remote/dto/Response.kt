package com.example.atlassainrepo.data.remote.dto

data class Respocse(
    val next: String,
    val pagelen: Int,
    val values: List<Value>
)