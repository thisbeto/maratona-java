package com.thisbeto.maratonajava.objetos.Minterfaces.testt;

import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.CalculaImposto;
import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.CalculaImpostoPF;
import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.CalculaImpostoPJ;

public class CalculaImpostoTest {
    public static void main(String[] args) {
        CalculaImpostoPF calculaImpostoPF = new CalculaImpostoPF();
        CalculaImpostoPJ calculaImpostoPJ = new CalculaImpostoPJ();
        double salario = 7000;
        double valorFinal;
        String pessoa = "PF";
        
        if (pessoa == "PJ") {
            valorFinal = calculaImpostoPF.calcula(salario);
        } else {
            valorFinal = calculaImpostoPJ.calcula(salario);
        }

        System.out.println(valorFinal);
    }

}
