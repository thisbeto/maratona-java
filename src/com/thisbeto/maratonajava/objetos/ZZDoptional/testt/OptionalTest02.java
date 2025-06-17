package com.thisbeto.maratonajava.objetos.ZZDoptional.testt;

import com.thisbeto.maratonajava.objetos.ZZDoptional.dominio.Manga;
import com.thisbeto.maratonajava.objetos.ZZDoptional.repostiorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaOptional = MangaRepository.findByTitle("Boruto");
        mangaOptional.ifPresent(m -> m.setTitle("Anime do Filho do Naruto"));
        System.out.println(mangaOptional);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Boruto")
                .orElseGet(() -> new Manga(3, "Naruto 2", 900));

        System.out.println(newManga);

    }
}
