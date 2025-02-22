package com.thisbeto.maratonajava.Exercicios;

/*
 Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
 */
public class Exerc19 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            for (int i = 0; i <= 10; i++) {
                int resu = num * i;
                System.out.println(num + " x " + i + " = " + resu);
            }
            num++;
            System.out.println("---------------");
        }
    }
}
