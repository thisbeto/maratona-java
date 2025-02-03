package com.thisbeto.maratonajava.objetos.Eblocosinicializacao.testt;

import com.thisbeto.maratonajava.objetos.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
