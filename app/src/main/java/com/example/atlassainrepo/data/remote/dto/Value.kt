package com.example.atlassainrepo.data.remote.dto

data class Value(
    val created_on: String,
    val description: String,
    val fork_policy: String,
    val full_name: String,
    val has_issues: Boolean,
    val has_wiki: Boolean,
    val is_private: Boolean,
    val language: String,
    val links: Links,
    val mainbranch: Mainbranch,
    val name: String,
    val override_settings: OverrideSettings,
    val owner: Owner,
    val project: Project,
    val scm: String,
    val size: Int,
    val slug: String,
    val type: String,
    val updated_on: String,
    val uuid: String,
    val website: String,
    val workspace: Workspace
)