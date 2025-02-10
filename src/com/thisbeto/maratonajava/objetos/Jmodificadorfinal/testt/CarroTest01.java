package com.thisbeto.maratonajava.objetos.Jmodificadorfinal.testt;

import com.thisbeto.maratonajava.objetos.Jmodificadorfinal.dominio.Carro;
import com.thisbeto.maratonajava.objetos.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
