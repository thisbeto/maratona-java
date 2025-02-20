package com.thisbeto.maratonajava.objetos.Npolimorfismo.testt;

import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.CalculaImposto;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Computador;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Televisao;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Tomate;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 5000);
        Tomate tomate = new Tomate("Tomate DevDojo", 10);
        Televisao tv = new Televisao("Samsung 50 pol", 4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
