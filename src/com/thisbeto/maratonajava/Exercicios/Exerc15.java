package com.thisbeto.maratonajava.Exercicios;

/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
meses e dias essa pessoa ja viveu.
Leve em consideração o ano com 365 dias e o mês com 30 dias.

(Ex: 5 anos, 2 meses e 15 dias de vida)
 */

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        DiaExerc15 objetAno = new DiaExerc15(22,2,2025);
        Scanner input = new Scanner(System.in);
        System.out.println("Dia de nascimento: ");
        int diaNascimento = input.nextInt();
        System.out.println("Mes de nascimento: ");
        int mesNascimento = input.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int ano = objetAno.anoAtual - anoNascimento;
        int mes = objetAno.mesAtual - mesNascimento;
        int dia = objetAno.dataAtual - diaNascimento;

        if (mes < 0){
            ano -= 1;
            mes += 12;
        }

        if (dia < 0) {
            mes -= 1;
            dia += 30;
        }

        System.out.println(ano+" anos, "+mes+" meses e "+dia+" dias de vida.");


    }
}
