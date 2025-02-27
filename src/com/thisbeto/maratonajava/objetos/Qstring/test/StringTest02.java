package com.thisbeto.maratonajava.objetos.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         Naruto      ";
        String numeros = "012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("N","B"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nome.trim());

    }
}
