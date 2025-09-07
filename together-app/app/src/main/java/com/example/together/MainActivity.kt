package com.example.together

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TogetherApp()
        }
    }
}

@Composable
fun TogetherApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Together") })
        }
    ) {
        Text("Добро пожаловать в Together!")
    }
}
