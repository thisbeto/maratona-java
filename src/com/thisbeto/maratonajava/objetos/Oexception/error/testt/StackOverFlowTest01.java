package com.thisbeto.maratonajava.objetos.Oexception.error.testt;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursiviade();
    }

    public static void recursiviade(){
        recursiviade();
    }
}
