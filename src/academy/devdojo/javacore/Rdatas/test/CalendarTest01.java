package academy.devdojo.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo");
        }
        Date date = c.getTime();
        System.out.println(date);
    }
}
