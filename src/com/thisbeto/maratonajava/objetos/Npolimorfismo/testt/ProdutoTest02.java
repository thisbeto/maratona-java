package com.thisbeto.maratonajava.objetos.Npolimorfismo.testt;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Computador;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Produto;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------");

        Produto produto2 = new Tomate("Americano",20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("---------------");
    }
}
