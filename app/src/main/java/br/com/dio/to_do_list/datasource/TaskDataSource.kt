package br.com.dio.to_do_list.datasource

import br.com.dio.to_do_list.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list

    // fun getList(): ArrayList<Task> {   acho que isso é equivalente à síntaxe de cima
    //   return list
    // }

    fun insertTask(task: Task) {
        if (task.id == 0) {
            list.add(task.copy(id = list.size + 1))
        } else {
            list.remove(task)
            list.add(task)
        }
    }

    fun findById(taskId: Int) = list.find { it.id == taskId }

    fun deleteTask(task: Task) {
        list.remove(task)
    }
}