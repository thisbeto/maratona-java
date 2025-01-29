package com.thisbeto.maratonajava.introducao.Aula05;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário for maior que 5k
        double salary = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Carrilho";
        String mensagemNaoDoar = "Ainda não tenho condições";
        // (condição) ? verdadeiro : falso;
        String resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
