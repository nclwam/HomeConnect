package com.example.homeconnect.Househelp

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity( tableName= "househelp_table")
 data class Househelp (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val FirstName: String,
    val LastName: String,
    val Phonenumber: Int,
    val identitynumber: Int,
)

