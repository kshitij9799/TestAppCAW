package com.example.testappcaw.util

import com.example.testappcaw.db.Task
import com.example.testappcaw.model.ForAllTask
import com.example.testappcaw.model.TaskList
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    suspend fun getTask() : TaskList
}