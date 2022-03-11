package ir.rahimmahmuodzadeh.news.data.api

import ir.rahimmahmuodzadeh.news.data.model.ParentResponse
import ir.rahimmahmuodzadeh.news.utils.Constants.API_TOKEN
import ir.rahimmahmuodzadeh.news.utils.Constants.EN
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("token") token: String = API_TOKEN,
        @Query("lang") language: String = EN
    ): ParentResponse

}