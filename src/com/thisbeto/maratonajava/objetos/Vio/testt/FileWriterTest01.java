package com.thisbeto.maratonajava.objetos.Vio.testt;

// File
// FileWriter -> Escrever um arquivo, de uma maneira mais simples
// FileReader -> Ler arquivo
// BufferedWriter -> Escrita num arquivo, mas com uma performance e trabalhando com dados em memoria
// BufferedReader -> Ler arquivos


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true) ){ // Pode passar um nome do arquivo
            fw.write("O DevDojo é o melhor curso do Brasil!");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
