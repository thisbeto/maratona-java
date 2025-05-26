package com.thisbeto.maratonajava.objetos.ZZClambdas.testt;

import com.thisbeto.maratonajava.objetos.ZZClambdas.dominio.Anime;
import com.thisbeto.maratonajava.objetos.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),
                new Anime("One piece", 100),
                new Anime("Naruto", 500)
        ));
        animeList.sort(animeComparators::compareByEpNonStatic);
        System.out.println(animeList);
    }
}
