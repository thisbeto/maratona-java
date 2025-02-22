package com.thisbeto.maratonajava.Exercicios;

/*
 Faça algoritmo que leia o nome e a idade de uma peso
 e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
 */

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Peso: ");
        double peso = input.nextDouble();
        System.out.println("Idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println(nome+ " é maior de idade.");
        } else {
            System.out.println(nome+ " é menor de idade.");
        }
    }
}
