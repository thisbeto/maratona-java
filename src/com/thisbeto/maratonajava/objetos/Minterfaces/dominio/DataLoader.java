package com.thisbeto.maratonajava.objetos.Minterfaces.dominio;

public interface DataLoader {
    public static int MAX_DATA_SIZE = 10;
    public void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
