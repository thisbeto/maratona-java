package com.thisbeto.maratonajava.objetos.Zgenerics.testt;

import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Carro;
import com.thisbeto.maratonajava.objetos.Zgenerics.servico.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
