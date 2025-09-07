package com.example.together

import com.google.firebase.firestore.FirebaseFirestore

class FirebaseManager {
    private val db = FirebaseFirestore.getInstance()

    fun addEvent(name: String, location: String) {
        val event = hashMapOf(
            "name" to name,
            "location" to location
        )
        db.collection("events").add(event)
    }
}
