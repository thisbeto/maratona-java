package com.thisbeto.maratonajava.objetos.Npolimorfismo.testt;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Computador;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Produto;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Tomate;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);


        Tomate tomate = new Tomate("Americano",20);
        tomate.setDataValidade("11/11/2011");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
