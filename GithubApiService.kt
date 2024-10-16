package com.example.githubapp

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface GithubApiService {
    @GET("search/repositories")
    fun searchRepositories(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int = 10
    ): Call<RepoSearchResponse>
}
