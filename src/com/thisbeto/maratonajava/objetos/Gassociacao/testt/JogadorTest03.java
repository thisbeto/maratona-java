package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Jogador;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Borré");
        Jogador jogador2 = new Jogador("L.D");
        Time time = new Time("Internacional");
        Jogador[] jogadores = {jogador, jogador2};


        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}