package com.thisbeto.maratonajava.Exercicios;

/*
Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */


import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lado A: ");
        int valA = input.nextInt();
        System.out.println("Lado B: ");
        int valB = input.nextInt();
        System.out.println("Lado C: ");
        int valC = input.nextInt();

        if (valA == valB && valB == valC) {
            System.out.println("Triangulo equilatero");
        }
        if (valA == valB || valA == valC || valB == valC) {
            System.out.println("Triangulo isóceles (dois lados iguais)");
        } else {
            System.out.println("Traingulo escaleno (todos os lados diferentes)");
        }
    }
}
