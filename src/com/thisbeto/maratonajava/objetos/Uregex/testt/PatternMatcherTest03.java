package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres, excluindo os brancos
        // \w = a-ZA-Z, dígitos, _ (basicamente excluiu os caracteres especiais)
        // \W = Tudo o que nao for incluso no \w
        // Range = [] a-z: vou do a ao z minisculo // A-C vou do A ao C maiusculo

        //String regex = "[a-zA-C]";

        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x01";
        Pattern pattern = Pattern.compile(regex); // Vai compilar e procurar
        Matcher matcher = pattern.matcher(texto2); // Vai retornar se deu match

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }

        int numeroHex = 0x1;
        System.out.println(numeroHex);
    }
}
