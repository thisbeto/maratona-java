package com.thisbeto.maratonajava.objetos.Oexception.exception.testt;

import com.thisbeto.maratonajava.objetos.Oexception.exception.dominio.Leitor1;
import com.thisbeto.maratonajava.objetos.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2();) {

        } catch (IOException e) {

        }
    }


    // CÓDIGO FEIO SEM TRY WITH RESOURCERS

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
