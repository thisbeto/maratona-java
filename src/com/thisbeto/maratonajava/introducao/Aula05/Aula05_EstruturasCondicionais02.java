package com.thisbeto.maratonajava.introducao.Aula05;

public class Aula05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 categoria adulto
        int idade = 145;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        }
        else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }
        else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
