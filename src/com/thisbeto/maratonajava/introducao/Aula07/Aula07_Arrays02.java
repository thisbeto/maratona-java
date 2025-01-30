package com.thisbeto.maratonajava.introducao.Aula07;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char = '/0000 ' ' espaço em branco
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Beto";
        nomes[1] = "Carrilho";
        nomes[2] = "This";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
