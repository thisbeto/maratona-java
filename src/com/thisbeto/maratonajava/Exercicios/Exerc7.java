package com.thisbeto.maratonajava.Exercicios;

import java.util.Scanner;

/*
 Faça um algoritmo que leia dois valores booleanos
 (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
 */

public class Exerc7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor (true or false)");
        boolean num = input.nextBoolean();

        if(num){
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }

    }

}
