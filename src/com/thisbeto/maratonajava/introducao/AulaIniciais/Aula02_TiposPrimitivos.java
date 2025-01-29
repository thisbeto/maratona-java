package com.thisbeto.maratonajava.introducao.AulaIniciais;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean


        /* Casting: Forçar uma variavel a se tornar outra
            long numeroGrande = (long) 155.23;
                Vai imprimir só 155 porque o long não suporte número com decimal

             Tipo primitivo = Guarda um valor simples
             String NÃO é primitivo. É uma classe. Classes começam com letra maiuscula.
        */

        int age = 10;
        long bigNumber = 10000;
        double salaryDouble = 2000;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        String name = "É O THIS VIDAAAAAA!";

        System.out.println("Minha idade é "+ name + " anos");
        System.out.println(falso);
        System.out.println("char " + caracter);
        System.out.println("Quem é que ta falando? " + name);

    }
}
