package com.example.newsappcompose.domain.repository

import com.example.newsappcompose.data.remote.dto.Article
import com.example.newsappcompose.data.remote.dto.NewsResponse

interface NewsRepository {
    suspend fun getNews(country:String):NewsResponse
}