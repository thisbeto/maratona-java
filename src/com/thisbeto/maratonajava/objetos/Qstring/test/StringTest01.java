package com.thisbeto.maratonajava.objetos.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Alberto"; // String constant pool
        String nome2 = "Alberto";
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
}
