package the.end2024.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import the.end2024.movieapp.ui.theme.Paddings

@Composable
@Preview(showBackground = true)
fun CategoryRow(
    categoryName: String = "Action",
) {
    Column(
        modifier = Modifier.padding(Paddings.large)
    ) {
        Text(
            text = categoryName,
            modifier = Modifier.padding(vertical = Paddings.large),
            style = MaterialTheme.typography.titleLarge
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(Paddings.large)
        ) {
            items(10) {
                MovieItem()
            }
        }
    }
}