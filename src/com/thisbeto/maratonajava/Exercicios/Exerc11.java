package com.thisbeto.maratonajava.Exercicios;

/*
Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome Aluno:");
        String nome = input.nextLine();
        System.out.println("Nota 1:");
        double numA = input.nextDouble();
        System.out.println("Nota 2:");
        double numB = input.nextDouble();
        System.out.println("Nota 3:");
        double numC = input.nextDouble();
        System.out.println("Nota 4:");
        double numD = input.nextDouble();

        double media = (numA + numB + numC + numD) / 4;

        System.out.println("Aluno: " +nome);
        if (media >= 7 ) {
            System.out.println("Aluno aprovado! Com média de " +media);
        } else {
            System.out.println("Aluno reprovado! Com média menor que 7. Média aluno: " +media);
        }
    }
}
