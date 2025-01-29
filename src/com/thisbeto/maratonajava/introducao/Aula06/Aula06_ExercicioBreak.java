package com.thisbeto.maratonajava.introducao.Aula06;

public class Aula06_ExercicioBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }

    }
}
