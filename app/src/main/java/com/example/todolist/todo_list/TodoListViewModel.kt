package com.example.todolist.todo_list

import androidx.lifecycle.ViewModel
import com.example.todolist.data.TodoRepository
import javax.inject.Inject

class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {

    val todos = repository.getTodos()
}