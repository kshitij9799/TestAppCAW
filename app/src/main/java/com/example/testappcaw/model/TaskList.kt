package com.example.testappcaw.model

data class TaskList(
    val todos : ArrayList<ForAllTask>,
    val limit : Int,
    val skip : Int,
    val total : Int
)
