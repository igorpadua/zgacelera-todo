import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatterDate {
    public static Date string_for_date(String tempTerm) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date term = null;
        try {
            term = formatter.parse(tempTerm);
        } catch (ParseException e) {
            System.out.println("Data escrito de forma incorreta");
        }
        return term;
    }

    public static String date_for_string(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }
}
