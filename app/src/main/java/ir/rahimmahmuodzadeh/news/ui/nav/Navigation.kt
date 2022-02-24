package ir.rahimmahmuodzadeh.news.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import ir.rahimmahmuodzadeh.news.ui.screens.home.HomeScreen
import ir.rahimmahmuodzadeh.news.utils.Screen

@ExperimentalPagerApi
@Composable()
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route=Screen.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(route=Screen.SavedScreen.route) {

        }

    }
}