package the.end2024.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun CategoryRow(
    categoryName: String = "Action",
) {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = categoryName,
            modifier = Modifier.padding(vertical = 10.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(10) {
                MovieItem()
            }
        }
    }


}