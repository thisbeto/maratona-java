package com.thisbeto.maratonajava.Exercicios;

// Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor da tabuada: ");
        int valA = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resu = valA * i;
            System.out.println(valA + " x " + i + " = " + resu);
        }
    }
}
