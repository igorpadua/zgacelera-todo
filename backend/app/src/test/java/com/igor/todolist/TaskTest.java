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
    @Test
    public void atualizarNome() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setNome("Tarefa 2");
        Assertions.assertEquals("Tarefa 2", task.getNome());
    }

    @Test
    public void atualizarDescricao() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setDescricao("Descrição da tarefa 2");
        Assertions.assertEquals("Descrição da tarefa 2", task.getDescricao());
    }

    @Test
    public void atualizarData() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setData_termino(new Date());
        Assertions.assertEquals(new Date(), task.getData_termino());
    }

    @Test
    public void atualizarPrioridade() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setNivel_prioridade((short) 2);
        Assertions.assertEquals((short) 2, task.getNivel_prioridade());
    }

    @Test
    public void atualizarCategoria() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setCategoria("Categoria 2");
        Assertions.assertEquals("Categoria 2", task.getCategoria());
    }

    @Test
    public void atualizarStatus() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        task.setStatus("Doing");
        Assertions.assertEquals("Doing", task.getStatus());
    }
}
