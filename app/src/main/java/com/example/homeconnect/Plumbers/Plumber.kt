package com.example.homeconnect.Plumbers

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName ="Plumbers_table")
data class Plumber (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val FirstName: String,
    val LastName: String,
    val PhoneNumber: Int,
    val IdentityNumber: Int,
)