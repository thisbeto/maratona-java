package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto2 = "abaaba";
        //String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex); // Vai compilar e procurar
        Matcher matcher = pattern.matcher(texto2); // Vai retornar se deu match

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
