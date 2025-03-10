package com.thisbeto.maratonajava.objetos.Vio.testt;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " +isCreated);
            System.out.println("Path: " +file.getPath());
            System.out.println("Path absolute: " +file.getAbsolutePath());
            System.out.println("is Directory: " +file.isDirectory());
            System.out.println("is File: " +file.isFile());
            System.out.println("is Hidden: " +file.isHidden());
            System.out.println("Last modified: " +new Date(file.lastModified())); // ele normal retorna um long em milisegundos
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
