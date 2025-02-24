package com.thisbeto.maratonajava.objetos.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Lógin inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
