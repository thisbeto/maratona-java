package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Consumidor;
import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alberto");
        Consumidor consumidor2 = new Consumidor("DevMagro");

        Manga manga1 = new Manga(5L, "Naruto", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Attack on titan", 3.2);
        Manga manga4 = new Manga(3L,"Pokemon", 11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z", 2.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - "+entry.getValue().getNome());
        }

    }
}
