package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | ou -> o(v|c)0 -> ovo | oco
        //  $ fim da linha
        // . carcter coringa -> 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "narutuuzumaki@yahoo.com, 7minutoz@gmail.com, #%$zoro@mail.br, hinata@hotmail.com, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#%$zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
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
