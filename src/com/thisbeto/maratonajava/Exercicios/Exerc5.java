package com.thisbeto.maratonajava.Exercicios;

import java.util.Scanner;

/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
(Base para o Salário mínimo R$ 1.293,20).
 */
public class Exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor salário mínimo: ");
        double salarioMinimo = input.nextDouble();
        System.out.println("Valor salário usuário:");
        double salarioUsuario = input.nextDouble();

        double salario = salarioUsuario/salarioMinimo;
        System.out.println("Esse usário recebe "+salario+" salarios minimos");
    }
}
