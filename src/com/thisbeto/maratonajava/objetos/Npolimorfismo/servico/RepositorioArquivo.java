package com.thisbeto.maratonajava.objetos.Npolimorfismo.servico;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Savlando em um Arquivo");
    }
}
