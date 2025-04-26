package com.thisbeto.maratonajava.objetos.ZZAclassesinternas.testt;

public class OuterClassesTest01 {
    private String name = "Naruto Uzumaki";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
    }
}
