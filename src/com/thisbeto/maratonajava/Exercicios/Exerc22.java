package com.thisbeto.maratonajava.Exercicios;

//  Faça um algoritmo que leia dois valores inteiros A e B,
//  imprima na tela o quociente e o resto da divisão inteira entre eles.


import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor 1: ");
        int valA = input.nextInt();
        System.out.println("Valor 2: ");
        int valB = input.nextInt();

        int quociente = valA / valB;
        int resto = valA % valB;

        System.out.println("Quociente de A/B: " +quociente);
        System.out.println("Resto de A/B: " +resto);
    }
}
