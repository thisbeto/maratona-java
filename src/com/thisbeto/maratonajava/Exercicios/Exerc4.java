package com.thisbeto.maratonajava.Exercicios;

import java.util.Scanner;
/*
    4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */
public class Exerc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int numA = input.nextInt();
        System.out.println("Sucessor = " +(numA+1));
        System.out.println("Antecessor = " +(numA-1));
    }
}
