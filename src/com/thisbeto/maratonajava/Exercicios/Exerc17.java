package com.thisbeto.maratonajava.Exercicios;
/*
Faça um algoritmo que leia uma temperatura em
Fahrenheit e calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)
 */

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperatura em Fahrenheit: ");
        double tempF = input.nextDouble();

        double celsius = (5 * ( tempF-32) / 9);

        System.out.println("Temperatura em Fahrenheit: " +tempF+"F");
        System.out.println("Temperatura em Celsius: " +celsius+" graus");

    }
}
