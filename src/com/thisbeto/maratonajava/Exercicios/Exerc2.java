package com.thisbeto.maratonajava.Exercicios;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir
// na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
                if (num > 0) {
                    System.out.println(num+ " é par e positivo");
                } else {
                    System.out.println(num+ " é par e negativo");
                }
        } else {
            if (num > 0) {
                System.out.println(num+ " é impar e positivo");
            } else {
                System.out.println(num+ " é impar e negativo");
            }
        }

    }
}
