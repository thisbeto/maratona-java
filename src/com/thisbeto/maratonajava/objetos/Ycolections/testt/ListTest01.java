package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Alberto");
        nomes.add("Dev Dojo");
        nomes2.add("Carrilho");
        nomes2.add("Java");
        //nomes.remove(0); // pode ser indice ou objeto

        nomes.addAll(nomes2);

        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
