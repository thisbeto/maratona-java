package com.thisbeto.maratonajava.objetos.Csobrecargametodos.testt;

import com.thisbeto.maratonajava.objetos.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kakashi","Foda");
        System.out.println(anime.toString());
        anime.init("Naruto Shippuden", "TV",12, "Shonen");
        System.out.println(anime.toString());
        anime.imprime();

    }
}
