package ir.rahimmahmuodzadeh.news.data.repository.getNews

import ir.rahimmahmuodzadeh.news.data.model.NewsModel
import ir.rahimmahmuodzadeh.news.data.model.ParentResponse

interface GetNews {

    suspend fun getResponse(): ParentResponse

    suspend fun getNews(): List<NewsModel>
}