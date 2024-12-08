package com.example.a17_2_modifier

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val customModifier = Modifier
    .fillMaxSize()
    .wrapContentSize(align = Alignment.BottomCenter)
    .padding(bottom = 50.dp)
    .border(width = 2.dp, color = Color.Red)
    .padding(horizontal = 20.dp, vertical = 10.dp)
    .border(width = 2.dp, color = Color.Red)
    .background(color = Color.Yellow)
    .padding(start = 10.dp, end = 10.dp, top = 2.dp, bottom = 5.dp)


@Composable
fun CustomMessage(
    message: String,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(align = Alignment.BottomCenter)
        .padding(bottom = 50.dp)
        .border(width = 2.dp, color = Color.Red)
        .padding(horizontal = 20.dp, vertical = 10.dp)
) {
    Text(text = message, modifier)
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EmptyModifierPreview() {
    CustomMessage(text, modifier = Modifier)
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultModifierPreview() {
    CustomMessage(text)
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CustomModifierPreview() {
    CustomMessage(text, modifier = customModifier)
}
