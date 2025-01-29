package com.thisbeto.maratonajava.objetos.Aintroducaoclasses.testt;

import com.thisbeto.maratonajava.objetos.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // carro1 = carro2; Referencia de Objetos. Só pode fazer isso quando tem objetos do mesmo tipo

        carro1.nome = "Onix";
        carro1.modelo = "LTZ";
        carro1.ano = 2020;

        carro2.nome = "Tesla";
        carro2.modelo = "Model X";
        carro2.ano = 2025;

        System.out.println("Nome: " +carro1.nome+ " Modelo: " +carro1.modelo+ " Ano: " +carro1.ano);
        System.out.println("Nome: " +carro2.nome+ " Modelo: " +carro2.modelo+ " Ano: " +carro2.ano);

    }
}
