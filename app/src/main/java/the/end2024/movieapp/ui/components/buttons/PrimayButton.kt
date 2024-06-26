package the.end2024.movieapp.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import the.end2024.movieapp.ui.theme.MovieAppTheme
import the.end2024.movieapp.ui.theme.Paddings

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    @StringRes textId: Int? = null,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = textId?.let { stringResource(id = it) } ?: text,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(Paddings.large)
            )
        }
    }
}

@Composable
@Preview
fun PrimaryButtonPreview() {
    MovieAppTheme {
        PrimaryButton(
            text = "SUBMIT",
            onClick = {}
        )
    }
}