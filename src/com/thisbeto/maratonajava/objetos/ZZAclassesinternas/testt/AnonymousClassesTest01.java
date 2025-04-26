package com.thisbeto.maratonajava.objetos.ZZAclassesinternas.testt;

class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() { // Só é possivel chamar os metodos que estrão dentro da classe objeto chamado
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
