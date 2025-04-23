package com.thisbeto.maratonajava.objetos.Zgenerics.testt;

import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Barco;
import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Carro;
import com.thisbeto.maratonajava.objetos.Zgenerics.servico.BarcoRentavelService;
import com.thisbeto.maratonajava.objetos.Zgenerics.servico.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando carro por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
