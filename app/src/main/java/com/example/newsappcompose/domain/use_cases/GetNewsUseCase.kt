package com.example.newsappcompose.domain.use_cases

import com.example.newsappcompose.common.Resource
import com.example.newsappcompose.data.remote.dto.toNews
import com.example.newsappcompose.domain.models.News
import com.example.newsappcompose.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    operator fun invoke(country:String):Flow<Resource<List<News>>> = flow{
        try {
            emit(Resource.Loading())
//            val list = repository.getNews(country).map { it.toNews() }
            val mimi = repository.getNews(country)
            val mimitwo = if (mimi.articles != null)mimi.articles.map { it -> it.toNews() } else emptyList()
            emit(Resource.Success(mimitwo))
        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "Error"))
        }catch (e: IOException){
            emit(Resource.Error(e.localizedMessage ?: "one error"))
        }

    }
}