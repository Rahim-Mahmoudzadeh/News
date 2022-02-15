package ir.rahimmahmuodzadeh.news.data.model
data class NewsModel(
    val title: String?,
    val description: String?,
    val content: String?,
    val url: String?,
    val image: String?,
    val publishedAt: String?,
    val source: SourceModel?
)