package com.empresa.appdefotos.model;

public class Postagem {
    private String nome;
    private String post;
    private Integer imagem;

    public Postagem() {
    }
    public Postagem(String nome, String post, Integer imagem) {
        this.nome = nome;
        this.post = post;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return post;
    }

    public void setPostagem(String postagem) {
        this.post = postagem;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }
}
