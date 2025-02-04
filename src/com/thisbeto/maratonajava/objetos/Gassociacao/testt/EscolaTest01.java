package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Escola;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Cesar");
        Professor professor2 = new Professor("Mario");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("ILV", professores);

        escola.imprime();

    }
}
