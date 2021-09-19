package com.example.composables

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun StyledText() {
    Text(
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Magenta,
                    fontSize = 30.sp
                )
            ) {
                append("A")
            }

            append("ttack ")

            withStyle(
                style = SpanStyle(
                    color = Color.Red,
                    fontSize = 50.sp
                )
            ) {
                append("of ")
            }

            withStyle(
                style = SpanStyle(
                    color = Color.Green,
                    fontSize = 20.sp,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append("Titan")
            }

            withStyle(
                style = SpanStyle(
                    color = Color.White,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append("s")
            }
        },
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
}