package ir.rahimmahmuodzadeh.news.data.model

data class ParentResponse(
    val articles: List<NewsModel>,
    val totalArticles: Int
)