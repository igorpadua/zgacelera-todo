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
            System.out.println("1 - Adicionar uma nova tarefa");
            System.out.println("2 - Listar tarefa por categoria");
            System.out.println("3 - Listar tarefa por prioridade");
            System.out.println("4 - Listar tarefa por status");
            System.out.println("5 - Listar tarefa por data de termino");
            System.out.println("6 - Verificar número de tarefas concluidas, estão para fazer e sendo feitas");
            System.out.println("7 - Modificiar uma tarefa");
            System.out.println("8 - Remover uma tarefa");
            System.out.println("9 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    // Criando uma nova Tarefa
                    System.out.print("Digite o nome da tarefa: ");
                    String tempNome = sc.nextLine();
                    System.out.print("Digite uma descrição para a tarefa: ");
                    String tempDesc = sc.nextLine();
                    System.out.print("Digite a data de termino: (dd/MM/yyyy)");
                    String tempTerm = sc.next();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    Date term = null;
                    try {
                        term = formatter.parse(tempTerm);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("Digite o nível de prioridade: ");
                    short tempNivel = sc.nextShort();
                    System.out.print("Digite uma categoria: ");
                    String tempCate = sc.next();

                    Task newTask = new Task(tempNome, tempDesc, term, tempNivel, tempCate);
                    tasks.add(newTask);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Comando incorreto!");
            }
        }
    }
}