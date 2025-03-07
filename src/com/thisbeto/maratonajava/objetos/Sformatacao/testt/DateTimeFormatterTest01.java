package com.thisbeto.maratonajava.objetos.Sformatacao.testt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20250307", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-03-07", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-03-07", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("07/03/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterCH = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CHINA);
        String formatCH = LocalDate.now().format(formatterCH);
        System.out.println(formatCH);
        LocalDate parseCH = LocalDate.parse("07.三月.2025", formatterCH);
        System.out.println(parseCH);
    }
}
