package com.thisbeto.maratonajava.Exercicios;

import java.util.Scanner;

/*

Faça um algoritmo que calcule a quantidade de litros de combustível
gastos em uma viagem, sabendo que o carro faz 12km com um litro.
Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua
velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.

Fórmula: distância = tempo x velocidade.
        litros usados = distância / 12.
 */
public class Exerc24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tempo da viagem (em horas):");
        double horas = input.nextDouble();
        System.out.println("Velocidade média:");
        double vm = input.nextDouble();

        double distancia = horas * vm;
        double litrosGas = distancia / 12;

        System.out.println("Distancia percorrida: " +distancia);
        System.out.println("Gasolina utilizada em litros: " +litrosGas);
    }
}
