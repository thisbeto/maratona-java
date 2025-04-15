package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // LinkedHashSet
        mangas.add(new Manga(5L,"Naruto", 19.9,0));
        mangas.add(new Manga(1L,"Berserk", 9.5,5));
        mangas.add(new Manga(4L,"Attack on titan", 3.2,0));
        mangas.add(new Manga(3L,"Pokemon", 11.20,2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99,0));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
