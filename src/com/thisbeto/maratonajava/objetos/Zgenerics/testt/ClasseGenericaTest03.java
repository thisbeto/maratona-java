package com.thisbeto.maratonajava.objetos.Zgenerics.testt;

import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Barco;
import com.thisbeto.maratonajava.objetos.Zgenerics.dominio.Carro;
import com.thisbeto.maratonajava.objetos.Zgenerics.servico.BarcoRentavelService;
import com.thisbeto.maratonajava.objetos.Zgenerics.servico.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),
                new Carro("Mercedes"),
                new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),
                new Barco("Jeti"),
                new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("-----------");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        rentalService2.retornarObjetoAlugado(barco);
    }
}
