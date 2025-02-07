package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Escola;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Joao");
        Professor professor2 = new Professor("Maria");
        Professor professor3 = new Professor("Pedro");
        Professor[] professores = {professor1, professor2, professor3};


        Escola escolaA = new Escola("Escola Felicidade");
        // A lista de professores vai vir de forma externa
        // Simulando uma chamada e recebemos a lista professores
        escolaA.setProfessores(professores);
        escolaA.imprime();

    }
}
