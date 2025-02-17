package com.thisbeto.maratonajava.objetos.Lclassesabstratas.testt;

import com.thisbeto.maratonajava.objetos.Lclassesabstratas.dominio.Desenvolvedor;
import com.thisbeto.maratonajava.objetos.Lclassesabstratas.dominio.Funcionario;
import com.thisbeto.maratonajava.objetos.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("This", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
