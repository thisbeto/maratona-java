package com.thisbeto.maratonajava.Exercicios;

//Faça um algoritmo que leia três notas obtidas
// por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nota 1:");
        double numA = input.nextDouble();
        System.out.println("Nota 2:");
        double numB = input.nextDouble();
        System.out.println("Nota 3:");
        double numC = input.nextDouble();

        System.out.println("Média das 3 notas: "+(numA+numB+numC)/3);
    }
}
