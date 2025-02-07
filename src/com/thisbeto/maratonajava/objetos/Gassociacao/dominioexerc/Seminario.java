package com.thisbeto.maratonajava.objetos.Gassociacao.dominioexerc;

import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                ", local=" + local +
                '}';
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}



