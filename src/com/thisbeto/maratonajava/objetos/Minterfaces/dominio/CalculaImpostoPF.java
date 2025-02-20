package com.thisbeto.maratonajava.objetos.Minterfaces.dominio;

public class CalculaImpostoPF implements CalculaImposto {
    @Override
    public double calcula(double valorRecebido) {
        if (valorRecebido <= 3000) {
            return valorRecebido * 0.9;
        }
        return valorRecebido * 0.8;
    }
}
