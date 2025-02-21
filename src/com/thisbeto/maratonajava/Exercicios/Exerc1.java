package com.thisbeto.maratonajava.Exercicios;

// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
// na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor A: ");
        int num1 = input.nextInt();
        System.out.println("Valor B: ");
        int num2 = input.nextInt();
        System.out.println("Valor C: ");
        int num3 = input.nextInt();

        int soma = num1 + num2;
        System.out.println("A + B = "+soma);
        if (soma < num3) {
            System.out.println(num3+" é maior do que a soma: "+soma);
        } else {
            System.out.println(soma + " é maior do que C: " +num3);
        }

    }
}
