package com.example.homeconnect.data

import  androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="users_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val user_type: Int,
    val FirstName:String,
    val LastName: String,
    val Email: String,
    val PhoneNumber:String,
    val Password: String,


)