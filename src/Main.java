import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean end = true;
        ArrayList<Task> tasks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        while (end) {
            menu();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    // Criando uma nova tarefa
                    tasks.add(newTask());
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
                    break;
                case 8:
                    // Modificar uma tarefa
                    break;
                case 9:
                    // Remover uma tarefa
                    deleteTask(tasks);
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



    public static Task newTask() {
        Scanner sc = new Scanner(System.in);

        // Criando uma nova Tarefa
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

        return new Task(tempNome, tempDesc, tempTerm, tempNivel, tempCate);
    }
    public static void deleteTask(ArrayList<Task> tasks) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o id da tarefa: ");
        int temp = sc.nextInt();

        if (temp > tasks.size()) {
            System.out.println("\nId incorreto!\n");
            return;
        }

        System.out.println("Deseja realmente remover a task " + tasks.get(temp).getNome() + "? (s ou n)");
        String res = sc.next();

        if (res.equals("s")) {
            tasks.remove(temp);
            System.out.println("\nTarefa removida!\n");
            return;
        }

        System.out.println("\nTarefa não removida!\n");
    }
}