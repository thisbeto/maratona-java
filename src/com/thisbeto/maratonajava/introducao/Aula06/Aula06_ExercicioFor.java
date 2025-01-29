package com.thisbeto.maratonajava.introducao.Aula06;

public class Aula06_ExercicioFor {
    // Numeros pares até 1 milhão
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
