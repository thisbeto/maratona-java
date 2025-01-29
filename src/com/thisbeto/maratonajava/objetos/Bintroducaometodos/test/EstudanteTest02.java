package com.thisbeto.maratonajava.objetos.Bintroducaometodos.test;

import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.Estudante;
import com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Betão";
        estudante01.idade = 25;
        estudante01.sexo = 'H';

        estudante02.nome = "Giane";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
