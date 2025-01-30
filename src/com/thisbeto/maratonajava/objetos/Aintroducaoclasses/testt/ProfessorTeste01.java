package com.thisbeto.maratonajava.objetos.Aintroducaoclasses.testt;

import com.thisbeto.maratonajava.objetos.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Carrilho";
        professor.idade = 40;
        professor.sexo = 'H';
        System.out.println("NOME: "+professor.nome + " IDADE:" +professor.idade+ " SEXO:"+ professor.sexo);
    }
}
