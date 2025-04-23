package com.thisbeto.maratonajava.objetos.Ycolections.testt;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "-"+entry.getValue());
        }


        // lower < imediatamente menor
        // floor <= Encontrou o valor igual a ele
        // higher > imediatamente maior
        // ceiling >= valor igual a ele ou maior
        // pool first retorna e remvoe p rimeiro elemento da lista
        // pool last reotrna e remvoe o uiltimo elemento da lista

        System.out.println(map.headMap("C"));
        System.out.println(map.ceilingEntry("C"));
        System.out.println(map.higherEntry("C"));
        System.out.println(map.lowerEntry("C"));
        System.out.println(map.floorEntry("C"));
    }
}
