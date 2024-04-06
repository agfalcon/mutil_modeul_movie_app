package the.end2024.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

private val CARD_WIDTH = 150.dp

@Composable
@Preview(showBackground = true)
fun MovieItem() {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
    ) {
        Poster(
            modifier = Modifier.width(CARD_WIDTH)
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "The Lord of the Ring 1",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Row(
            modifier = Modifier.padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(12.dp),
                tint = Color.Black.copy(
                    alpha = 0.5f
                )
            )
            Text(
                text = "5.0"
            )
        }
    }
}

@Composable
fun Poster(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.height(200.dp)
    ) {
        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = null,
            contentDescription = null,
            placeholder = ColorPainter(Color.Blue)
        )
    }
}