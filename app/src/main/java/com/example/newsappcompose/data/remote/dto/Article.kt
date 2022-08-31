package com.example.newsappcompose.data.remote.dto

import com.example.newsappcompose.domain.models.News

data class Article(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)

    fun Article.toNews():News{
        return News(
            author = author,
            content = content,
            description = description,
            title = title,
            url = url,
            source = source.toString(),
            urlToImage = urlToImage
        )
    }
