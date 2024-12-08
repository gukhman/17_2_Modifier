package com.example.a17_2_modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnotherCustomMessage(
    message: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = message,
        fontSize = 20.sp,
        modifier = modifier
    )
}

@Composable
fun Modifier.getAnotherDefaultModifier(): Modifier {
    return this
        .fillMaxSize()
        .wrapContentSize(align = Alignment.TopCenter)
}

@Composable
fun Modifier.getAnotherCustomModifier(): Modifier {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    return this
        .size(screenWidth - 50.dp)
        .clip(CircleShape)
        .background(Color.Cyan)
        .border(2.dp, Color.Yellow, CircleShape)
        .wrapContentSize(align = Alignment.Center)
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AnotherDefaultModifierPreview() {
    AnotherCustomMessage(text, Modifier.getAnotherDefaultModifier())
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AnotherCustomModifierPreview() {
    AnotherCustomMessage(text, Modifier.getAnotherCustomModifier())
}
