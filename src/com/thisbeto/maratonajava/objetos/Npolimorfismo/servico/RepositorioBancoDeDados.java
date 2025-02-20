package com.thisbeto.maratonajava.objetos.Npolimorfismo.servico;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
