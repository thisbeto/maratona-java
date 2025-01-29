package com.thisbeto.maratonajava.introducao.Aula05;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;

        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode beber");
        } else {
            System.out.println("Não pode beber");
        }
        if(isAutorizadoComprarBebida == false){ // isso seria a mesma coisa que colocar !isAutorizadoComprarBebida
            System.out.println("Não pode beber");
        }

    }
}
