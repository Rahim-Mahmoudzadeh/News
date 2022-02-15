package ir.rahimmahmuodzadeh.news.ui.component

import android.widget.ImageView
import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import ir.rahimmahmuodzadeh.news.R
@ExperimentalCoilApi
@Composable
fun PaintImage(imageUrl: String): ImagePainter {
    return rememberImagePainter(
        data = imageUrl,
        builder = {
            placeholder(R.drawable.placeholder)
            error(R.drawable.cloudnichterreichbar)
        }
    )
}