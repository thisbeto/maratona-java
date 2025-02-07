package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Aluno;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc.Seminario;

import java.util.Arrays;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carrilho", 18);
        Seminario seminario1 = new Seminario("Entrada na área de TI");
        Seminario seminario2 = new Seminario("Como ter Sucesso em TI");
        Seminario[] listaSeminarios = {seminario1, seminario2};
        aluno.setSeminarios(listaSeminarios);
        System.out.println(Arrays.toString(aluno.getSeminarios()));
    }
}
