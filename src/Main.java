import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
                    break;
                case 2:
                    // Listar tarefas
                    if (tasks.size() == 0) {
                        System.out.println("\nNão existe tarefas!\n");
                        break;
                    }
                    for (int i = 0; i < tasks.size(); ++i) {
                        System.out.println(i + " - " + tasks.get(i).toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    // Listar tarefas por categoria
                    break;
                case 4:
                    // Listar tarefa por prioridade
                    break;
                case 5:
                    // Listar tarefa por status
                    break;
                case 6:
                    // Listar tarefa por data de termino
                    break;
                case 7:
                    // Verificar número de tarefas concluidas, estão para fazer e sendo feitas
                    System.out.println(TasksLists.tasksTodoDoingDone(tasks));
                    break;
                case 8:
                    // Modificar uma tarefa
                    TasksLists.modifyTask(tasks);
                    break;
                case 9:
                    // Remover uma tarefa
                    TasksLists.deleteTask(tasks);
                    break;
                case 10:
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
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Listar tarefa por categoria");
        System.out.println("4 - Listar tarefa por prioridade");
        System.out.println("5 - Listar tarefa por status");
        System.out.println("6 - Listar tarefa por data de termino");
        System.out.println("7 - Verificar número de tarefas concluidas, estão para fazer e sendo feitas");
        System.out.println("8 - Modificiar uma tarefa");
        System.out.println("9 - Remover uma tarefa");
        System.out.println("10 - Sair");
    }
}