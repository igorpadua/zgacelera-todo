package com.igor.todolist.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatterDate {
    public static Date string_for_date(String tempTerm) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date data_termino = new Date();
        try {
            data_termino = formatter.parse(tempTerm);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return data_termino;
    }

    public static String date_for_string(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }
}
