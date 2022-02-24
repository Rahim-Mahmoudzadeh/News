package ir.rahimmahmuodzadeh.news.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import ir.rahimmahmuodzadeh.news.R

@Composable
fun Toolbar() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colors.onBackground)
    ) {
        val (profileImage, newImage, saveImage) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "profile",
            modifier = Modifier.size(25.dp,25.dp)
                .constrainAs(profileImage){
                    top.linkTo(parent.top)
                    start.linkTo(parent.start, margin = 6.dp)
                    bottom.linkTo(parent.bottom)
                }
            )
        Image(
            painter = painterResource(id = R.drawable.news),
            contentDescription = "news icon",
            modifier = Modifier.size(70.dp,60.dp)
                .constrainAs(newImage){
                    top.linkTo(parent.top)
                    start.linkTo(profileImage.end)
                    end.linkTo(saveImage.start)
                    bottom.linkTo(parent.bottom)
                }
        )
        Image(
            painter = painterResource(id = R.drawable.ic_saved),
            contentDescription = "sava icon",
            modifier = Modifier.size(25.dp,25.dp)
                .constrainAs(saveImage){
                    top.linkTo(parent.top)
                    end.linkTo(parent.end, margin = 6.dp)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}
@Preview
@Composable
fun ShowToolbar(){
    Toolbar()
}