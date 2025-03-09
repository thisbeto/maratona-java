package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres, excluindo os brancos
        // \w = a-ZA-Z, dígitos, _ (basicamente excluiu os caracteres especiais)
        // \W = Tudo o que nao for incluso no \w
        // Range = [] a-z: vou do a ao z minisculo // A-C vou do A ao C maiusculo
        //String regex = "[a-zA-C]";

        //  Zero ou uma
        // * zerou ou mais
        // * uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | ou -> o(v|c)0 -> ovo | oco
        //  $ fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex); // Vai compilar e procurar
        Matcher matcher = pattern.matcher(texto); // Vai retornar se deu match

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }


    }
}
