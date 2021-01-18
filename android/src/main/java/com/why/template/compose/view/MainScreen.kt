package com.why.template.compose.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
private fun formatHelloText(name: String): AnnotatedString =
    buildAnnotatedString {
        append("Hello ")
        withStyle(
            SpanStyle(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.primary
            )
        ) {
            append(name)
        }
        append("!")
    }

@Composable
fun Greeting(name: String) {
    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.align(Alignment.Center)) {
                Text(text = formatHelloText(name))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() = Greeting(name = "Jetpack Compose")