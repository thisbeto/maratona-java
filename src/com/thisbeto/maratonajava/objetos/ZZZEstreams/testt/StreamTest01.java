package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import com.thisbeto.maratonajava.objetos.ZZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet", 5.99),
            new LightNovel("Naruto", 2.99),
            new LightNovel("Dragon Ball", 5.99),
            new LightNovel("Full Metal", 1.99),
            new LightNovel("Boku no Hero", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }

        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
