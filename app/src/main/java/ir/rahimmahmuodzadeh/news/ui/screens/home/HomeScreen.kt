package ir.rahimmahmuodzadeh.news.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ir.rahimmahmuodzadeh.news.ui.component.Toolbar

@Composable
fun HomeScreen(){
   Column(modifier = Modifier.fillMaxSize()) {
      Toolbar()

   }
}

@Preview
@Composable
fun ShowHomeScreen(){
   Toolbar()
}