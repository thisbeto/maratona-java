package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande Software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM!");
        } else {
            System.out.println("NÃO!");
        }
    }
}
