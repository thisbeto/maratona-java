package com.thisbeto.maratonajava.Exercicios;

/*
 Faça um algoritmo que receba um valor A e B, e troque o valor de
 A por B e o valor de B por A e imprima na tela os valores.
 */

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor A: ");
        int valA = input.nextInt();
        System.out.println("Valor B: ");
        int valB = input.nextInt();

        int temp = valA;
        valA = valB;
        valB = temp;

        System.out.println("Valor A: " +valA);
        System.out.println("Valor B: " +valB);
    }
}
