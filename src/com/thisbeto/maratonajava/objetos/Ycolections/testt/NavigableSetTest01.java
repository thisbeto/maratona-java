package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Manga;
import com.thisbeto.maratonajava.objetos.Ycolections.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L,"Naruto", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Attack on titan", 3.2));
        mangas.add(new Manga(3L,"Pokemon", 11.20));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99));
        mangas.add(new Manga(10L,"Aaragon", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L,"Yuyu", 3.2);

        // lower < imediatamente menor
        // floor <= Encontrou o valor igual a ele
        // higher > imediatamente maior
        // ceiling >= valor igual a ele ou maior
        // pool first retorna e remvoe p rimeiro elemento da lista
        // pool last reotrna e remvoe o uiltimo elemento da lista

        System.out.println("-----");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

    }
}
