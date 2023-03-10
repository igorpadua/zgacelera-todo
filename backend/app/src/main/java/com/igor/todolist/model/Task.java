package com.igor.todolist.model;

import com.igor.todolist.util.FormatterDate;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (nivel_prioridade != task.nivel_prioridade) return false;
        if (!Objects.equals(nome, task.nome)) return false;
        if (!Objects.equals(descricao, task.descricao)) return false;
        if (!Objects.equals(data_termino, task.data_termino)) return false;
        if (!Objects.equals(categoria, task.categoria)) return false;
        return Objects.equals(status, task.status);
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