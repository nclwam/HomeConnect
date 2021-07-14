package com.example.homeconnect.Electrician

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "electrician_table")
data class Electrician(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val FirstName: String,
    val LastName: String,
    val PhoneNumber: Int,
    val IdentityNumber: Int,
)


