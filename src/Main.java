import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc = 0;
        Boolean end = true;
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        menu();

        while (end) {
            System.out.println("Escolha uma opção do menu:");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    // Criando uma nova tarefa
                    tasks.add(TasksLists.newTask());
                    System.out.println("\nTarefa adicionado com sucesso!\n");
                    Collections.sort(tasks);
                    break;
                case 2:
                    // Listar tarefas por prioridade
                    TasksLists.taskListPriority(tasks);
                    break;
                case 3:
                    // Listar tarefas por categoria
                    TasksLists.taskListCategoria(tasks);
                    break;
                case 4:
                    // Listar tarefa por status
                    TasksLists.taskListStatus(tasks);
                    break;
                case 5:
                    // Listar tarefa por data de termino
                    break;
                case 6:
                    // Verificar número de tarefas concluidas, estão para fazer e sendo feitas
                    System.out.println(TasksLists.tasksTodoDoingDone(tasks));
                    break;
                case 7:
                    // Modificar uma tarefa
                    TasksLists.modifyTask(tasks);
                    break;
                case 8:
                    // Remover uma tarefa
                    TasksLists.deleteTask(tasks);
                    break;
                case 9:
                    // Sair do programa
                    System.out.println("Programa finalizado!");
                    end = false;
                    break;
                default:
                    System.out.println("Comando incorreto!");
            }
        }
        sc.close();
    }
    public static void menu() {
        System.out.println("1 - Adicionar uma nova tarefa");
        System.out.println("2 - Listar tarefa por prioridade");
        System.out.println("3 - Listar tarefa por categoria");
        System.out.println("4 - Listar tarefa por status");
        System.out.println("5 - Listar tarefa por data de termino");
        System.out.println("6 - Verificar número de tarefas concluidas, estão para fazer e sendo feitas");
        System.out.println("7 - Modificiar uma tarefa");
        System.out.println("8 - Remover uma tarefa");
        System.out.println("9 - Sair");
    }
}