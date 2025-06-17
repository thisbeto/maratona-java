package com.thisbeto.maratonajava.objetos.ZZZEstreams.testt;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x,y) -> x + y));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, Integer::sum));

        System.out.println("---------");
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
