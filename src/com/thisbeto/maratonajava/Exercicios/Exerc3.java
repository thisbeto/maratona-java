package com.thisbeto.maratonajava.Exercicios;

import java.util.Scanner;

/*Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.

 */
public class Exerc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int numA = input.nextInt();
        System.out.println("Digite o valor de B:");
        int numB = input.nextInt();

        if (numA == numB) {
            int c = numA + numB;
            System.out.println("Soma A+B: " +c);
        } else {
            int c = numA * numB;
            System.out.println("Multiplicação AxB: " +c);
        }




    }
}
