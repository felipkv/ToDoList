package br.com.dio.to_do_list.datasource

import br.com.dio.to_do_list.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

   fun getList() = list

    // fun getList(): ArrayList<Task> {   acho que isso é equivalente à síntaxe de cima
    //   return list
   // }

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}