package com.igor.todolist;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Task implements Comparable<Task> {
    private String nome;
    private String descricao;
    private Date data_termino;
    private short nivel_prioridade;
    private String categoria;
    private String status;

    public Task(String nome, String descricao, Date data_termino, short nivel_prioridade, String categoria, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.data_termino = data_termino;
        this.nivel_prioridade = nivel_prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Nome='" + nome + '\'' +
                ", Descricao='" + descricao + '\'' +
                ", Data termino=" + FormatterDate.date_for_string(data_termino) +
                ", Nivel prioridade=" + nivel_prioridade +
                ", Categoria='" + categoria + '\'' +
                ", Status='" + status + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nivel_prioridade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

    public short getNivel_prioridade() {
        return nivel_prioridade;
    }

    public void setNivel_prioridade(short nivel_prioridade) {
        this.nivel_prioridade = nivel_prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Task t1) {
        if (this.nivel_prioridade < t1.nivel_prioridade) {
            return -1;
        } else  if (this.nivel_prioridade > t1.nivel_prioridade) {
            return 1;
        }
        return 0;
    }

    public int compareCategoria(Task task, Task t1) {
        return task.getCategoria().compareTo(t1.getCategoria());
    }
}
class TaskCompareData implements Comparator<Task> {
    @Override
    public int compare(Task task, Task t1) {
        return task.getData_termino().compareTo(t1.getData_termino());
    }
}

class TaskCompareCategoria implements Comparator<Task> {
    @Override
    public int compare(Task task, Task t1) {
        return task.getCategoria().compareTo(t1.getCategoria());
    }
}

class TaskCompareStatus implements Comparator<Task> {
    @Override
    public int compare(Task task, Task t1) {
        return task.getStatus().compareTo(t1.getStatus());
    }
}