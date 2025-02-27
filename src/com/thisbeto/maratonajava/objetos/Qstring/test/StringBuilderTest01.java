package com.thisbeto.maratonajava.objetos.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Alberto Huber";
        nome.concat(" This");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Xis Beto");
        sb.append(" Alberto").append(" This");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
