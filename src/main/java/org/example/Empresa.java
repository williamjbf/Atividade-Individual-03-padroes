package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Produto> produtos = new ArrayList<>();
    private final Notificador notificador = new Notificador();


    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        this.notificarProduto(produto);
    }

    private void notificarProduto(Produto produto){
        List<Cliente> clientesFiltrados = filtrarClienteNincho(produto);
        this.notificador.notificar(clientesFiltrados, produto);
    }

    private List<Cliente> filtrarClienteNincho(Produto produto){
        List<Cliente> clientesFiltrados = new ArrayList<>();
        for(Cliente cliente: this.clientes){
            if(cliente.getNincho().equals(produto.getNinchoAlvo()))
                clientesFiltrados.add(cliente);
        }
        return clientesFiltrados;
    }








    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
