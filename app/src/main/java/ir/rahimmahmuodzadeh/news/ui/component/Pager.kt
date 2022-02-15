package ir.rahimmahmuodzadeh.news.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.lerp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.pager.*
import ir.rahimmahmuodzadeh.news.data.model.NewsModel
import kotlin.math.absoluteValue

@ExperimentalCoilApi
@ExperimentalPagerApi
@Composable
fun Pager(newsList:List<NewsModel>){
    val pagerState = rememberPagerState(
       initialPage = newsList.size
    )
    Column (){
         HorizontalPager(count = newsList.size,state = pagerState) { index->
             Card(
                 Modifier
                     .graphicsLayer {
                         val pageOffset = calculateCurrentOffsetForPage(index).absoluteValue
                         lerp(
                             start = ScaleFactor(0.55f, 0.55f),
                             stop = ScaleFactor(1f, 1f),
                             fraction = 1f - pageOffset.coerceIn(0f, 1f)
                         ).also { scale ->
                             scaleX = scale.scaleX
                             scaleY = scale.scaleY
                         }

                         alpha = lerp(
                             start = ScaleFactor(0.5f, 0.5f),
                             stop = ScaleFactor(1f, 1f),
                             fraction = 1f - pageOffset.coerceIn(0f, 1f)
                         ).scaleX
                     }
             ) {
                ConstraintLayout() {
                    val (image,title) = createRefs()
                    Image(painter = PaintImage(imageUrl = newsList[index].image.toString()), contentDescription = "")
                }
             }
         }
    }
}