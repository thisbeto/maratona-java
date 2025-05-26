package com.thisbeto.maratonajava.objetos.ZZClambdas.testt;

import com.thisbeto.maratonajava.objetos.ZZClambdas.dominio.Anime;
import com.thisbeto.maratonajava.objetos.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("Naruto", 500)
        ));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEp);
        System.out.println(animeList);
    }
}
