package com.thisbeto.maratonajava.objetos.Jmodificadorfinal.testt;

import com.thisbeto.maratonajava.objetos.Jmodificadorfinal.dominio.Carro;
import com.thisbeto.maratonajava.objetos.Jmodificadorfinal.dominio.Comprador;

public class CompradorTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn"); 
    }
}
