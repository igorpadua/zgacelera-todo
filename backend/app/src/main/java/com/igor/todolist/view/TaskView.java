package com.igor.todolist.view;

import com.igor.todolist.model.Task;
import com.igor.todolist.util.FormatterDate;

import java.util.*;

public class TaskView {

    public static void cadastradoComSucesso() {
        System.out.println("Tarefa cadastrada com sucesso!");
    }

    public static void atualizadoComSucesso() {
        System.out.println("Tarefa atualizada com sucesso!");
    }

    public static void excluidoComSucesso() {
        System.out.println("Tarefa excluida com sucesso!");
    }

    public static int idTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o id da tarefa: ");
        return sc.nextInt();
    }

    private static void listaVazia() {
        System.out.println("Não existe tarefas cadastradas!");
    }

    public static Task cadastro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da tarefa: ");
        String tempNome = sc.nextLine();
        System.out.print("Digite uma descrição para a tarefa: ");
        String tempDesc = sc.nextLine();
        System.out.print("Digite a data de termino(dd/MM/yyyy): ");
        Date tempTerm = FormatterDate.string_for_date(sc.next());
        System.out.print("Digite o nível de prioridade(1-5): ");
        short tempNivel = sc.nextShort();
        sc = new Scanner(System.in);
        System.out.print("Digite uma categoria: ");
        String tempCate = sc.next();

        return new Task(tempNome, tempDesc, tempTerm, tempNivel, tempCate, "ToDo");
    }

    private static void menuAtualizar() {
        System.out.println("O que você deseja atualizar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Descrição");
        System.out.println("3 - Data de termino");
        System.out.println("4 - Nível de prioridade");
        System.out.println("5 - Categoria");
        System.out.println("6 - Status");
        System.out.println("7 - Finalizar atualização");
    }

    public static void atualizar(Task task) {
        boolean finalizarAtualizacao = true;
        Scanner scanner = new Scanner(System.in);
        while (finalizarAtualizacao) {
            menuAtualizar();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o novo nome: ");
                    task.setNome(scanner.next());
                }
                case 2 -> {
                    System.out.print("Digite a nova descrição: ");
                    task.setDescricao(scanner.next());
                }
                case 3 -> {
                    System.out.print("Digite a nova data de termino(dd/MM/yyyy): ");
                    task.setData_termino(FormatterDate.string_for_date(scanner.next()));
                }
                case 4 -> {
                    System.out.print("Digite o novo nível de prioridade(1-5): ");
                    task.setNivel_prioridade(scanner.nextShort());
                }
                case 5 -> {
                    System.out.print("Digite a nova categoria: ");
                    task.setCategoria(scanner.next());
                }
                case 6 -> {
                    System.out.print("Digite o novo status: ");
                    task.setStatus(scanner.next());
                }
                case 7 -> finalizarAtualizacao = false;
                default -> System.out.println("Opção inválida!");
            }
        }

    }

    public static String contaTarefas(List<Task> tasks) {
        int todo = 0;
        int doing = 0;
        int done = 0;
        for (Task task : tasks) {
            if (task.getStatus().equals("ToDo")) {
                todo++;
            } else if (task.getStatus().equals("Doing")) {
                doing++;
            } else {
                done++;
            }
        }
        return "ToDo: " + todo + " Doing: " + doing + " Done: " + done;
    }

    public static void listarTarefas(List<Task> tasks, Comparator<Task> comparator) {
        if (tasks.isEmpty()) {
            listaVazia();
            return;
        }

        tasks.sort(comparator);

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
