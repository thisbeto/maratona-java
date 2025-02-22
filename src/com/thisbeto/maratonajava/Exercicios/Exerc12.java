package com.thisbeto.maratonajava.Exercicios;

/*
Faça um algoritmo que leia o valor de um produto e
determine o valor que deve ser pago, conforme a escolha da forma de pagamento
pelo comprador e imprima na tela o valor final do produto a ser pago.
Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

     1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
     2 - À Vista no cartão de crédito, recebe 10% de desconto
     3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
     4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Valor compra:");
            double valorCompra = input.nextDouble();
            System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
            System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
            System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
            System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            int op = input.nextInt();
            if (op == 1) {
                System.out.println("Valor original: R$ " + valorCompra);
                double newValor = valorCompra - valorCompra * 0.15;
                System.out.println("Valor com 15% de desconto em Dinheiro/PIX: R$ " + newValor);
            }
            if (op == 2) {
                System.out.println("Valor original: R$ " + valorCompra);
                double newValor = valorCompra - valorCompra * 0.1;
                System.out.println("Valor com 10% de desconto no cartão de crédito: R$ " + newValor);
            }
            if (op == 3) {
                System.out.println("Valor original: R$ " + valorCompra);
                double newValor = valorCompra / 2;
                System.out.println("Valor da parcela em 2x sem juros: R$ " + newValor);
            }
            if (op == 4) {
                System.out.println("Valor original: R$ " + valorCompra);
                double newValor = valorCompra + valorCompra * 0.1;
                System.out.println("Valor do produto para parcelar em 3x com 10% de juros: R$ " + newValor);
            }
        }



    }
}
