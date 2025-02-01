package com.thisbeto.maratonajava.objetos.Bintroducaometodos.test;

import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.Estudante;
import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Betão";
        estudante01.idade = 25;
        estudante01.sexo = 'H';

        estudante02.nome = "Giane";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
