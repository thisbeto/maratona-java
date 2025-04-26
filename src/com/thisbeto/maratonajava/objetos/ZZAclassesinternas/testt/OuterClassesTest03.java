package com.thisbeto.maratonajava.objetos.ZZAclassesinternas.testt;

public class OuterClassesTest03 {
    private String name = "Pedro";
    static class Nested {
        private String lastName = "Brabo";
        void print() {
            System.out.println(new OuterClassesTest03().name + " "+lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
