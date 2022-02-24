package ir.rahimmahmuodzadeh.news.ui.screens.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ir.rahimmahmuodzadeh.news.R
import ir.rahimmahmuodzadeh.news.ui.theme.Grey
import ir.rahimmahmuodzadeh.news.ui.theme.MediumGrey

@Composable
fun ToolbarSaved(navController: NavController) {
    Column() {
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "back",
                modifier = Modifier.clickable(
                    onClick = {navController.navigateUp()}
                )
            )
           Text(
               text = stringResource(id = R.string.save), style = TextStyle(
                   color = Grey,
                   fontFamily = FontFamily.SansSerif,
                   fontSize = 18.sp,
               )
           )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(0.5.dp)
                .background(MediumGrey)
        )
    }
}