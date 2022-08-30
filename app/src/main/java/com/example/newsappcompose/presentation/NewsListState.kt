package com.example.newsappcompose.presentation

import com.example.newsappcompose.domain.models.News

data class NewsListState(
    val isLoading: Boolean = false,
    val news:List<News> = emptyList(),
    val error:String = ""
)
