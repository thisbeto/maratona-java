package com.thisbeto.maratonajava.objetos.Npolimorfismo.servico;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Computador;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Produto;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto; // ((Tomate) produto).getDataValidade();
            System.out.println(tomate.getDataValidade());
        }
    }

}
