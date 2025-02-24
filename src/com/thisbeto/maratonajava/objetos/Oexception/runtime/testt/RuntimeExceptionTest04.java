package com.thisbeto.maratonajava.objetos.Oexception.runtime.testt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticExceptio ");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeExcpetion");
        }

        try {
            talvezLanceExcpetion();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExcpetion() throws SQLException, IOException{
    }

}