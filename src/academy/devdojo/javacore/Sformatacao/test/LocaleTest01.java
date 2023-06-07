package academy.devdojo.javacore.Sformatacao.test;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeAlemanha = new Locale("de", "DEU");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJP);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeAlemanha);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("Brasil: " + df3.format(calendar.getTime()));
        System.out.println("Alemanha: " + df5.format(calendar.getTime()));
        System.out.println("Japao: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df6.format(calendar.getTime()));

    }
}
