package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Naruto");
        mangas.add("Berserk");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.48);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }
}
