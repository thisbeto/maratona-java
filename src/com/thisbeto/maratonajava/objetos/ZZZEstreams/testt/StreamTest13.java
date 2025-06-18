package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import com.thisbeto.maratonajava.objetos.ZZZEstreams.dominio.Category;
import com.thisbeto.maratonajava.objetos.ZZZEstreams.dominio.LightNovel;
import com.thisbeto.maratonajava.objetos.ZZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet", 5.99, Category.DRAMA),
            new LightNovel("Naruto", 2.99, Category.FANTASY),
            new LightNovel("Dragon Ball", 5.99, Category.FANTASY),
            new LightNovel("Full Metal", 1.99, Category.FANTASY),
            new LightNovel("Boku no Hero", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        // Map<Category, Map <Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                )));

        System.out.println(collect1);
    }
}
