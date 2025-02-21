package com.thisbeto.maratonajava.Exercicios;

/*
6 - Faça um algoritmo que leia
um valor qualquer e imprima na tela com um reajuste de 5%.
 */

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de A:");
        int numA = input.nextInt();

        double newValor = numA + numA * 0.05;
        System.out.println("Valor com reajuste: " +newValor);
    }
}
