package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import com.thisbeto.maratonajava.objetos.ZZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet", 5.99),
            new LightNovel("Naruto", 2.99),
            new LightNovel("Dragon Ball", 5.99),
            new LightNovel("Full Metal", 1.99),
            new LightNovel("Full Metal", 1.99),
            new LightNovel("Boku no Hero", 4.00)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}
