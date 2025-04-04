package com.example.testappcaw.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.testappcaw.db.Task
import com.example.testappcaw.db.TaskDao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CompletedTaskViewModel @Inject constructor(
    private val taskDao: TaskDao
) : ViewModel() {
    val allCompletedTasks: LiveData<List<Task>> = taskDao.getAllCompletedTasks()
}