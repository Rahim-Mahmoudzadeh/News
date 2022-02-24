package ir.rahimmahmuodzadeh.news.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import ir.rahimmahmuodzadeh.news.data.model.NewsModel
import ir.rahimmahmuodzadeh.news.data.model.SourceModel
import ir.rahimmahmuodzadeh.news.ui.component.Pager
import ir.rahimmahmuodzadeh.news.ui.component.Toolbar

@ExperimentalPagerApi
@Composable
fun HomeScreen(navController: NavController){
   Column(modifier = Modifier.fillMaxSize()) {
      Toolbar()
      val new=NewsModel("s","dass","sads","asd","das","dsaasd"
      , SourceModel("sdas","Sdas")
      )
      val list:List<NewsModel> = listOf(new)
      Pager(newsList = list)
      Lazy

   }
}

@Preview
@Composable
fun ShowHomeScreen(){
   Toolbar()
}