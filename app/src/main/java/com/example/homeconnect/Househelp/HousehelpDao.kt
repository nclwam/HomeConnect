package com.example.homeconnect.Househelp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.homeconnect.data.User


@Dao
interface HousehelpDao {
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        fun  addHousehelp(user: Househelp)

        @Query("SELECT * FROM househelp_table ORDER BY id ASC")
        fun readAllData(): LiveData<List<Househelp>>

    @Query("Select * FROM househelp_table where FirstName = (:FirstName) and LastName = (:LastName)and Phonenumber =(:Phonenumber)and identitynumber = (:identitynumber) ")
    //select all the records in the database that has the firstname and password that the user has given
    fun register (FirstName:String ,LastName:String, Phonenumber: String, identitynumber: String): Househelp
    }
