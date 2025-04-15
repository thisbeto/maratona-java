package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        // Equals compara o valor da string, se forem iguais, ele retorna true
        // == compara o valor de memoria

        Smartphone s1 = new Smartphone("1ABC", "iPhone");
        Smartphone s2 = new Smartphone("1ABC", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
