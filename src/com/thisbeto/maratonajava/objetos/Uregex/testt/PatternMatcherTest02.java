package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres, excluindo os brancos
        // \w = a-ZA-Z, dígitos, _ (basicamente excluiu os caracteres especiais)
        // \W = Tudo o que nao for incluso no \w
        String regex = "\\s";
        String texto2 = "d157@6 654afab wa7";
        //String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex); // Vai compilar e procurar
        Matcher matcher = pattern.matcher(texto2); // Vai retornar se deu match

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }
    }
}
