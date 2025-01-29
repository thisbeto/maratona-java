package com.thisbeto.maratonajava.objetos.Bintroducaometodos.test;

import com.thisbeto.maratonajava.objetos.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "This";
        estudante.idade = 21;
        estudante.sexo = 'H';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
