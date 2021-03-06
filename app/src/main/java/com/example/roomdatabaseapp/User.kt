package com.example.roomdatabaseapp

import androidx.room.*

@Entity
data class User(

    @PrimaryKey(autoGenerate = true)
    var userId: Long,

    @ColumnInfo(name = "first_name")
    val firstName: String,

    @ColumnInfo(name = "last_name")
    val lastName: String

){
    @Ignore
    constructor(firstName: String, lastName: String) : this(0, firstName, lastName)
}

