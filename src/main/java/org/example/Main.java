package org.example;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.setNome("AABBCC");

        Cliente cliente1 = new Cliente("João", Nicho.ALIMENTOS);
        Cliente cliente2 = new Cliente("Paulo", Nicho.BEBIDAS);
        Cliente cliente3 = new Cliente("Frederico", Nicho.CONFECCOES);
        Cliente cliente4 = new Cliente("Maria", Nicho.LIVROS);
        Cliente cliente5 = new Cliente("Jorge", Nicho.ALIMENTOS);
        Cliente cliente6 = new Cliente("Mika", Nicho.BEBIDAS);
        Cliente cliente7 = new Cliente("Kelly", Nicho.CONFECCOES);
        Cliente cliente8 = new Cliente("Rita", Nicho.LIVROS);

        empresa.adicionarCliente(cliente1);
        empresa.adicionarCliente(cliente2);
        empresa.adicionarCliente(cliente3);
        empresa.adicionarCliente(cliente4);
        empresa.adicionarCliente(cliente5);
        empresa.adicionarCliente(cliente6);
        empresa.adicionarCliente(cliente7);
        empresa.adicionarCliente(cliente8);

        Produto comida = new Produto("Maçã", Nicho.ALIMENTOS);
        Produto bebida = new Produto("Coca-Cola", Nicho.BEBIDAS);
        Produto confeccoes = new Produto("Camiseta", Nicho.CONFECCOES);
        Produto livros = new Produto("Book", Nicho.LIVROS);

        empresa.adicionarProduto(comida);
        empresa.adicionarProduto(bebida);
        empresa.adicionarProduto(confeccoes);
        empresa.adicionarProduto(livros);

    }
}