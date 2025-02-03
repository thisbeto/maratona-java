package com.thisbeto.maratonajava.objetos.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default o o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    // A principal diferença é que o bloco é executado independente do construtor chamado
    // Se eu fosse colocar
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
    }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int eps: this.episodios){
            System.out.print(eps+ " ");
        }
        System.out.println(" ");
    }
    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
