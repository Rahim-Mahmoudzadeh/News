package ir.rahimmahmuodzadeh.news.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.google.accompanist.pager.*
import ir.rahimmahmuodzadeh.news.data.model.NewsModel

@ExperimentalPagerApi
@Composable
fun Pager(newsList:List<NewsModel>){
    val pagerState = rememberPagerState(
       initialPage = newsList.size
    )
    Column (){
         HorizontalPager(count = newsList.size,state = pagerState) {
             
         }
    }
}