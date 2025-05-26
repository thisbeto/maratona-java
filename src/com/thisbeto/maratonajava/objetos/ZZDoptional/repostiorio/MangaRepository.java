package com.thisbeto.maratonajava.objetos.ZZDoptional.repostiorio;

import com.thisbeto.maratonajava.objetos.ZZDoptional.dominio.Manga;

import java.util.List;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boruto", 200), new Manga(2, "Overlord", 25));

}
