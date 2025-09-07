package com.example.together

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

@Composable
fun CreateEventScreen() {
    var eventName by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = eventName,
            onValueChange = { eventName = it },
            label = { Text("Название события") }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Место встречи") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* TODO: сохранить событие */ }) {
            Text("Создать событие")
        }
    }
}
