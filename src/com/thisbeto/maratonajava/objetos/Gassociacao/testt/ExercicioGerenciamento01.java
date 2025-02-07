package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Aluno;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Local;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Professor;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Seminario;

public class ExercicioGerenciamento01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Pedro",18);
        Aluno[] alunosParaSeminario = {aluno};

        Local local = new Local("Faculdade Tararara");
        Professor professor = new Professor("Prof. Carrilho", "Programação");

        Seminario seminario = new Seminario("Seminário Matemática", alunosParaSeminario, local);
        Seminario[] seminarioDisponiveis = {seminario};


        professor.setSeminarios(seminarioDisponiveis);

        professor.imprime();

    }
}
