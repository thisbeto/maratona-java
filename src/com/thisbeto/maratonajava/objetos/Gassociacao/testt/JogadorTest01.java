package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");
        Jogador[] jogadores = {jogador1,jogador2,jogador3}; // Jogador[] jogadores = new Jogador[3];
        for (Jogador jogador: jogadores){
            jogador.imprime();
        }

    }
}
