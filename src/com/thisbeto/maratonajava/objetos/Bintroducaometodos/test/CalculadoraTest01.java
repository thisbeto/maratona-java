package com.thisbeto.maratonajava.objetos.Bintroducaometodos.test;

import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.Calculadora;

import static com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.Calculadora.somaDoisNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        //int resultadoSoma = somaDoisNumeros(10,20);
        //System.out.println(resultadoSoma);
        //System.out.println("Finalizando CalculadoraTest01");

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.validaPrimo(2));

    }
}
