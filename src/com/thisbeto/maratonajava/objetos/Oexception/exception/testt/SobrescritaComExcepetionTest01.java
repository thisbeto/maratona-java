package com.thisbeto.maratonajava.objetos.Oexception.exception.testt;

import com.thisbeto.maratonajava.objetos.Oexception.exception.dominio.Funcionario;
import com.thisbeto.maratonajava.objetos.Oexception.exception.dominio.LoginInvalidoException;
import com.thisbeto.maratonajava.objetos.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExcepetionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}