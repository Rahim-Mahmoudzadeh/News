package ir.rahimmahmuodzadeh.news.ui.screens.save

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import ir.rahimmahmuodzadeh.news.ui.component.Toolbar
import ir.rahimmahmuodzadeh.news.ui.screens.utils.ToolbarSaved
import ir.rahimmahmuodzadeh.news.utils.Screen
@ExperimentalFoundationApi
@Composable
fun SaveScreen(navController: NavController){
    Column {
        ToolbarSaved(navController)
        LazyVerticalGrid(cells = GridCells.Fixed(2), contentPadding = PaddingValues(8.dp) ){

        }
    }
}