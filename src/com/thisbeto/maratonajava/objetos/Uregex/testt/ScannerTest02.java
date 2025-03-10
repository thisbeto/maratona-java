package com.thisbeto.maratonajava.objetos.Uregex.testt;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            if(scanner.hasNextInt()) { // enquanto existir um proximo inteiro
                int i = scanner.nextInt(); // quero que voce pegue
                System.out.println("Int: "+i); // printe o num inteiro
            } else if (scanner.hasNextBoolean()) { // enquanto existir um boolean
                boolean b = scanner.nextBoolean(); // quero que voce pegue
                System.out.println("Boolean: "+b); // printe o boolean
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
