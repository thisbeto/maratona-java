package com.thisbeto.maratonajava.objetos.Zgenerics.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Naruto");
        lista.add("Sasuke");

        for (String o : lista){
            System.out.println(o);
        }

        add(lista, new Consumidor("Midoriya"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
