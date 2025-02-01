package com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void imprimeMedia(){
        double soma = 0;
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        System.out.println("Media: "+(soma/ salario.length));
    }
}


