package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Consumidor;
import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alberto");
        Consumidor consumidor2 = new Consumidor("DevMagro");

        Manga manga1 = new Manga(5L, "Naruto", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Attack on titan", 3.2);
        Manga manga4 = new Manga(3L,"Pokemon", 11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z", 2.99);


        List<Manga> mangaConsuimidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsuimidor2List = List.of(manga3, manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsuimidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsuimidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("---"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----"+manga.getNome());
            }
        }

    }
}
