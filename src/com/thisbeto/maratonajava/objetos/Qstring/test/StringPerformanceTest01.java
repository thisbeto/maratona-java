package com.thisbeto.maratonajava.objetos.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Builder " + (fim - inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String Buffer " + (fim - inicio)+"ms");
    }

    private static void concatString(int tamanho) {
       String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i; // 0,01,012,013
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbu = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbu.append(i);
        }
    }

}
