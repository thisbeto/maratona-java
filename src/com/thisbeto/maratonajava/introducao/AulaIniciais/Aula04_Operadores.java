package com.thisbeto.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println("Valor " + result);

        // % = resto . Bom para saber se o resultado é par ou impar. Se da = 0 o num é par
        int resto = 20 % 2;
        System.out.println("Resto " + resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez " + isDezIgualQueDez);
        System.out.println("isDezDiferenteQueDez " + isDezDiferenteQueDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinda = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinda " + isDentroDaLeiMenorQueTrinda);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

    }
}
