package com.thisbeto.maratonajava.objetos.Dconstrutores.testt;

import com.thisbeto.maratonajava.objetos.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Sasuke","TV",12, "Shonen","Disney");
        anime.imprime();

            Anime anime2 = new Anime("Naruto");
        System.out.println(anime2.toString());
        System.out.println(anime.toString());

    }
}
