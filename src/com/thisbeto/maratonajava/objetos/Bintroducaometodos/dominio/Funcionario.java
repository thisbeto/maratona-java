package com.thisbeto.maratonajava.objetos.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void imprimeMedia(){
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        System.out.println("Media: "+(soma/ salario.length));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getSoma() {
        return soma;
    }
}


