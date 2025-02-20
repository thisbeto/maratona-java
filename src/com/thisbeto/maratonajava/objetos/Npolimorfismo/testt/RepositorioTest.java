package com.thisbeto.maratonajava.objetos.Npolimorfismo.testt;

import com.thisbeto.maratonajava.objetos.Npolimorfismo.repositorio.Repositorio;
import com.thisbeto.maratonajava.objetos.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
