package com.thisbeto.maratonajava.objetos.Gassociacao.testt;

import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Jogador;
import com.thisbeto.maratonajava.objetos.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
