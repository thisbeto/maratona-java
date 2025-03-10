package com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario[] seminarios;


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", seminarios=" + Arrays.toString(seminarios) +
                '}';
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario[] seminarios) {
        this.nome = nome;
        this.idade = idade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
