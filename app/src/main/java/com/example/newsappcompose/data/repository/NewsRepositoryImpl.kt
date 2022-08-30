package com.example.newsappcompose.data.repository

import com.example.newsappcompose.data.remote.NewsApi
import com.example.newsappcompose.data.remote.dto.Article
import com.example.newsappcompose.data.remote.dto.NewsResponse
import com.example.newsappcompose.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val api:NewsApi
):NewsRepository {
    override suspend fun getNews(country: String): NewsResponse {
        return api.getNews(country)
    }
}