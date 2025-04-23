package com.thisbeto.maratonajava.objetos.Zgenerics.testt;

import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List <Barco> barcoList = criarArrayComObjeto(new Barco("Canoa marota"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarArrayComObjeto(T t){
        return List.of(t);
    }
}

