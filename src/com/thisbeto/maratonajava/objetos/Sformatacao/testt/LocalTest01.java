package com.thisbeto.maratonajava.objetos.Sformatacao.testt;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();

       DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
       DateFormat df2 =  DateFormat.getDateInstance(DateFormat.FULL, localeCH);
       DateFormat df3 =  DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
       DateFormat df4 =  DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

       System.out.println("Italia: " +df1.format(calendar.getTime()));
       System.out.println("Suiça: " +df2.format(calendar.getTime()));
       System.out.println("India: " +df3.format(calendar.getTime()));
       System.out.println("Japão: " +df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeIndia));
        System.out.println(localeCH.getDisplayCountry(localeJapao));
        System.out.println(localeIndia.getDisplayCountry(Locale.ENGLISH));

    }
}
