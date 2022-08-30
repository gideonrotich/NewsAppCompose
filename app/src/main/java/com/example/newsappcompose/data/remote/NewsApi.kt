package com.example.newsappcompose.data.remote

import com.example.newsappcompose.BuildConfig.API_KEY
import com.example.newsappcompose.common.Constants
import com.example.newsappcompose.data.remote.dto.Article
import com.example.newsappcompose.data.remote.dto.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NewsApi {
    @GET(Constants.NEWS_HEADLINE)
    suspend fun getNews(@Query("country")country: String, @Query("apiKey")
    apiKey: String = API_KEY): NewsResponse
}