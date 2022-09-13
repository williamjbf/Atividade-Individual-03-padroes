package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private Nicho nicho;
    private List<Mensagem> mensagem;

    public Cliente(String nome, Nicho nicho) {
        this.nome = nome;
        this.nicho = nicho;
        this.mensagem = new ArrayList<>();
    }

    public void adicionarMensagem(Mensagem mensagem){
        this.mensagem.add(mensagem);
        System.out.println(mensagem.getMensagem());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nicho getNincho() {
        return nicho;
    }

    public void setNincho(Nicho nicho) {
        this.nicho = nicho;
    }

    public List<Mensagem> getMensagem() {
        return mensagem;
    }

    public void setMensagem(List<Mensagem> mensagem) {
        this.mensagem = mensagem;
    }
}
