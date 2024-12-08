package com.example.a17_2_modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier


const val text = "Привет"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomMessage(message = text, modifier = customModifier)
            AnotherCustomMessage(message = text, modifier = Modifier.getAnotherCustomModifier())
        }
    }
}
