package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> group : devdojo) {
            for (String person : group) {
                System.out.println(person);
            }

        }

        System.out.println("-----");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
