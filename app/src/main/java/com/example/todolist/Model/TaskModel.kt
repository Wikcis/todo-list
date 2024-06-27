package com.example.todolist.Model
data class TaskModel(
    var id: Int,
    val title: String,
    val description: String,
    val category: String,
    val creationDate: String,
    val endDate: String,
    val attachment: String,
    val notifications: Int
)
