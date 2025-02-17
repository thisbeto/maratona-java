package com.thisbeto.maratonajava.objetos.Minterfaces.testt;

import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.DataBaseLoader;
import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.DataLoader;
import com.thisbeto.maratonajava.objetos.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
