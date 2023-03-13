package com.igor.todolist;

import com.igor.todolist.model.Task;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

public class TaskTest {
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

    @Test
    public void compararPrioridade() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Task task2 = new Task("Tarefa 2", "Descrição da tarefa 2", new Date(), (short) 2, "Categoria 2", "Doing");
        Assertions.assertEquals(-1, task.compareTo(task2));
    }

    @Test
    public void compararCategoria() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Task task2 = new Task("Tarefa 2", "Descrição da tarefa 2", new Date(), (short) 2, "Categoria 2", "Doing");
        Assertions.assertEquals(-1, task.compareCategoria(task, task2));
    }

    @Test
    public void getNome() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals("Tarefa 1", task.getNome());
    }

    @Test
    public void getDescricao() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals("Descrição da tarefa 1", task.getDescricao());
    }

    @Test
    public void getData() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals(new Date(), task.getData_termino());
    }

    @Test
    public void getPrioridade() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals((short) 1, task.getNivel_prioridade());
    }

    @Test
    public void getCategoria() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals("Categoria 1", task.getCategoria());
    }

    @Test
    public void getStatus() {
        Task task = new Task("Tarefa 1", "Descrição da tarefa 1", new Date(), (short) 1, "Categoria 1", "ToDo");
        Assertions.assertEquals("ToDo", task.getStatus());
    }

}
