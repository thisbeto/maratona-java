package com.thisbeto.maratonajava.Exercicios;

/*
Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m
e cresce 3 centímetros por ano. Faça um algoritmo que calcule e
imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
 */

public class Exerc18 {
    public static void main(String[] args) {
        double sara = 1.10;
        double fran = 1.50;
        int cont = 0;

        while (sara < fran) {
            cont++;
            sara += 0.03;  // Incrementa a altura de Sara
            fran += 0.02;  // Incrementa a altura de Francisco
        }

        System.out.println("Serão necessários " +cont+ " anos para que Sara ultrapasse Francisco.");
    }
}
