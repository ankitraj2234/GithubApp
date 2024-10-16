package com.example.githubapp

data class Repository(
    val id: Int,
    val name: String,
    val owner: Owner,
    val html_url: String,
    val description: String?
)

data class Owner(
    val login: String,
    val avatar_url: String
)
