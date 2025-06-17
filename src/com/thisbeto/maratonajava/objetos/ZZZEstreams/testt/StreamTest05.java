package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        // Quebra a primeira palavra em letras
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        // Mapeando cada palavra para um array de letras
        List<String[]> collect = words.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        // Criando uma Stream a partir do array de letras
        Stream<String> stream = Arrays.stream(letters);

        // Quebrando todas as palavras em letras e juntando tudo em uma única lista
        List<String> allLetters = words.stream()
                .map(w -> w.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(allLetters);
    }
}
