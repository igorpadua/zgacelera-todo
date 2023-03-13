package com.igor.todolist.controller;

import com.igor.todolist.model.Task;
import com.igor.todolist.view.TaskView;

import java.util.Collections;
import java.util.List;

public class TaskController {
    public static Task criarTarefa() {
        Task task =  TaskView.cadastro();
        TaskView.cadastradoComSucesso();
        return task;
    }

    public static void atualizarTarefa(List<Task> tasks) {
        final int ID_TASK = TaskView.idTask();
        Collections.sort(tasks);
        TaskView.atualizar(tasks.get(ID_TASK));
        TaskView.atualizadoComSucesso();
    }

    public static void excluirTarefa(List<Task> tasks) {
        Collections.sort(tasks);
        final int ID_TASK = TaskView.idTask();
        tasks.remove(ID_TASK);
        TaskView.excluidoComSucesso();
    }
}
