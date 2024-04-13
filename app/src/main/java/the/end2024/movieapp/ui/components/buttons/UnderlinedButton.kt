package the.end2024.movieapp.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import the.end2024.movieapp.ui.theme.MovieAppTheme
import the.end2024.movieapp.ui.theme.Paddings

@Composable
fun UnderlinedButton(
    modifier: Modifier = Modifier,
    @StringRes textId: Int? = null,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        border = BorderStroke(
            width = 2.dp,
            color = MaterialTheme.colorScheme.secondary
        ),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.secondary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = textId?.let { stringResource(id = it) } ?: text,
                style = MaterialTheme.typography.labelLarge,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.padding(Paddings.large)
            )
        }
    }
}

@Composable
@Preview
fun UnderlinedButtonPreview() {
    MovieAppTheme {
        UnderlinedButton(
            text = "CANCEL",
            onClick = {}
        )
    }
}