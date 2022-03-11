package ir.rahimmahmuodzadeh.news.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
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
import ir.rahimmahmuodzadeh.news.utils.Resource
import org.koin.androidx.compose.viewModel

@ExperimentalPagerApi
@Composable
fun HomeScreen(navController: NavController) {
    val viewModel by viewModel<HomeViewModel>()
    val newsList by viewModel.liveData.observeAsState()
    Column(modifier = Modifier.fillMaxSize()) {
        Toolbar()
        newsList?.let { news ->

            when (news) {
//                is Resource.Loading ->{
//
//                }
                is Resource.Success<*> -> {
                    Pager(newsList = news.data as List<NewsModel>)
                }
//                is Resource.Error ->{
//
//                }
            }

//         LazyColumn(content = 1){
//
//         }
        }

    }
}

@Preview
@Composable
fun ShowHomeScreen() {
    Toolbar()
}