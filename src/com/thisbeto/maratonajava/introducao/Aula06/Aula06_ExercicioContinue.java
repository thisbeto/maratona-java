package com.thisbeto.maratonajava.introducao.Aula06;

public class Aula06_ExercicioContinue {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorCarro = 40000;
        for (int i = 1; i <= valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + i + " R$ " + valorParcela);
        }

    }
}

