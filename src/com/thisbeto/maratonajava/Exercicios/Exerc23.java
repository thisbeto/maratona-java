package com.thisbeto.maratonajava.Exercicios;

/*
Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor
da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor da Hora Aula:");
        double valorHoraAula = input.nextDouble();
        System.out.println("Número de aulas lecionadas no mês:");
        int aulasDadas = input.nextInt();
        System.out.println("Desconto INSS:");
        double descontoInss = input.nextDouble();

        double salarioBruto = aulasDadas * valorHoraAula;
        double salarioLiquido = salarioBruto - salarioBruto * descontoInss/100;

        System.out.println("Salario Bruto: R$ "+salarioBruto);
        System.out.println("Salario Liquido: R$ "+salarioLiquido);
    }

}
