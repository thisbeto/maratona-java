package com.thisbeto.maratonajava.objetos.ZZClambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodes = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", eps=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
