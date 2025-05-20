package com.example.todolist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "todo")
data class Todo(
    @ColumnInfo("Title") val title: String,
    @ColumnInfo("Description") val description: String?,
    @ColumnInfo("IsDone") val isDone: Boolean,
    @PrimaryKey val id: Int? = null
)
