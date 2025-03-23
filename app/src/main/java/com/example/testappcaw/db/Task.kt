package com.example.testappcaw.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "task_name") val task: String,
    @ColumnInfo(name = "task_desc") val desc: String,
    @ColumnInfo(name = "task_status") val status: String
)