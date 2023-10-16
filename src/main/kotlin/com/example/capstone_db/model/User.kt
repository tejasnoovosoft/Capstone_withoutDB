package com.example.capstone_db.model

data class User(
    val userId: Long,
    val username: String,
    val address_street: String,
    val address_city: String,
    val address_state: String,
    val address_pin: Long
)