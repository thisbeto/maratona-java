package com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio;

public class Calculadora {

    public static int somaDoisNumeros(int numero1, int numero2) {
        System.out.println("Iniciando função de soma: ");
        return numero1 + numero2;
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivsaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return; // Esse return vai voltar pro CalculadoraTest03 e caso o num2 seja igual a 0 e nem vai executar o sout abaixo
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " +num1);
        System.out.println("Num2 " +num2);
    }

    // Desafio: Criar uma calculadora que valida se um numero é primo ou não
    // Retornar true se for, false se nao for
    // ele mesmo e 1
    // nump1 >= 1

    // Desafio2: Criar uma calculadora que recebe uma lista/array,
    // Retorna a lista x2

    public boolean validaPrimo(int num1p){
        if (num1p < 1) {
            return false;
        }
        for (int i = 2; i < num1p; i++) {
            if (num1p % i == 0) {
                System.out.println("Calculando a divisão do: " +num1p + " por " +i);
                return false;
            }
        }
        return true;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }




}
