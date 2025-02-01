package com.thisbeto.maratonajava.objetos.Bintroducaometodos.test;

import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedrão");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{5000, 4000, 3000});

        funcionario.imprime();
        funcionario.imprimeMedia();
    }
}
