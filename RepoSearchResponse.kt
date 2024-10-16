package com.example.githubapp

data class RepoSearchResponse(
    val total_count: Int,
    val items: List<Repository>
)
