package com.thisbeto.maratonajava.Exercicios;

//  Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Exerc21 {
    public static void main(String[] args) {
        Random ram = new Random();
        int num = ram.nextInt(101);
        System.out.println(num);
    }
}