import java.io.*;
import java.util.List;

public class TasksTxt {
    public static void readTasks(List<Task> tasks) {

        File file = new File("./src/myTasks.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null) {
                String fields[] = line.split(";");
                tasks.add(new Task(fields[0], fields[1], FormatterDate.string_for_date(fields[2]), Short.valueOf(fields[3]), fields[4], fields[5]));
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
