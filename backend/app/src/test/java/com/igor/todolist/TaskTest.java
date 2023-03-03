package com.igor.todolist;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskTest {
    @Test
    public void deletarTarefa() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task);

        TasksLists.deletaTarefa(tasks, 0);
        Assertions.assertEquals(0, tasks.size());
    }

    @Test
    public void adicionarTarefa() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Task result = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");

        Assertions.assertEquals(result, task);
    }
}
