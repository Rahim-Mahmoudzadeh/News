package ir.rahimmahmuodzadeh.news.data.repository.getNews

import ir.rahimmahmuodzadeh.news.data.api.ApiServiceBuilder
import ir.rahimmahmuodzadeh.news.data.api.NewsApi
import ir.rahimmahmuodzadeh.news.data.model.NewsModel
import ir.rahimmahmuodzadeh.news.data.model.ParentResponse

class GetNewsImplantation(val newsApi: NewsApi):GetNews {
    override suspend fun getResponse(): ParentResponse =newsApi.getNews()

    override suspend fun getNews(): List<NewsModel> {
        return getResponse().articles.map {
              it
        }
    }
}