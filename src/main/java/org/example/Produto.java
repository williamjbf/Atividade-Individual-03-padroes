package org.example;

public class Produto {

    private String nome;
    private Nicho nichoAlvo;

    public Produto(String nome, Nicho nichoAlvo) {
        this.nome = nome;
        this.nichoAlvo = nichoAlvo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nicho getNinchoAlvo() {
        return nichoAlvo;
    }

    public void setNinchoAlvo(Nicho nichoAlvo) {
        this.nichoAlvo = nichoAlvo;
    }
}
