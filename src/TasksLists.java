import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TasksLists {
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

    public static void modifyTask(List<Task> tasks) {

        if (tasks.size() == 0) {
            System.out.println("\nNão existe tarefas\n");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o id da tarefa que você quer modificar: ");
        int temp = sc.nextInt();

        if (temp > tasks.size()) {
            System.out.println("\nId incorreto!\n");
            return;
        }

        System.out.println("Você quer modificar o nome da task(" + tasks.get(temp).getNome() + ")? (s ou n)");
        String op = sc.next();
        if (op.equals("s")) {
            sc = new Scanner(System.in);
            tasks.get(temp).setNome(sc.nextLine());
            System.out.println("Modificado o nome com sucesso!");
        }

        System.out.println("Você quer modificar o descrição da task(" + tasks.get(temp).getDescricao() + ")? (s ou n)");
        op = sc.next();
        if (op.equals("s")) {
            sc = new Scanner(System.in);
            tasks.get(temp).setDescricao(sc.nextLine());
            System.out.println("Modificado a descrição com sucesso!");
        }

        System.out.println("Você quer modificar o data de termino da task(" + FormatterDate.date_for_string(tasks.get(temp).getData_termino()) + ")? (s ou n)");
        op = sc.next();
        if (op.equals("s")) {
            sc = new Scanner(System.in);
            tasks.get(temp).setData_termino(FormatterDate.string_for_date(sc.next()));
            System.out.println("Modificado a data com sucesso!");
        }

        System.out.println("Você quer modificar o nível de prioridade da task(" + tasks.get(temp).getNivel_prioridade() + ")? (s ou n)");
        op = sc.next();
        if (op.equals("s")) {
            sc = new Scanner(System.in);
            tasks.get(temp).setNivel_prioridade(sc.nextShort());
            System.out.println("Modificado o nível de prioridade com sucesso!");
        }

        System.out.println("Você quer modificar a categoria da task(" + tasks.get(temp).getCategoria() + ")? (s ou n)");
        op = sc.next();
        if (op.equals("s")) {
            sc = new Scanner(System.in);
            tasks.get(temp).setCategoria(sc.nextLine());
            System.out.println("Modificado a categoria com sucesso!");
        }

        System.out.println("Você quer modificar o status da task(" + tasks.get(temp).getStatus() + ")? (s ou n)");
        op = sc.next();
        if (op.equals("s")) {
            System.out.println("Status:\n1.ToDo\n2.Doing\n3.Done\n");
            sc = new Scanner(System.in);
            tasks.get(temp).setStatus(sc.next());
            System.out.println("Modificado o status com sucesso!");
        }

        System.out.println("\nTarefa modificada!\n");

    }

    public static void deleteTask(List<Task> tasks) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o id da tarefa que você quer remover: ");
        int temp = sc.nextInt();

        if (temp > tasks.size()) {
            System.out.println("\nId incorreto!\n");
            return;
        }

        System.out.println("Deseja realmente remover a task " + tasks.get(temp).getNome() + "? (s ou n)");
        String res = sc.next();

        if (res.equals("n")) {
            System.out.println("\nTarefa não removida!\n");
            return;
        }
        tasks.remove(temp);
        System.out.println("\nTarefa removida!\n");
    }

    public static String tasksTodoDoingDone(List<Task> tasks) {
        int toDo = 0;
        int doing = 0;
        int done = 0;

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equals("ToDo")) {
                toDo++;
            } else if (tasks.get(i).getStatus().equals("Doing")) {
                doing++;
            } else {
                done++;
            }
        }
        return "Existe " + toDo + " tarefa(s) pendendes\n" +
                "Existe " + doing + " tarefa(s) sendo executadas\n" +
                "Existe " + done + " tarefa(s) já concluidas";
    }

    public static void taskOrderPriority {
        
    }
}
