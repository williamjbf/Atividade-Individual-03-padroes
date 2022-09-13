package org.example;

import java.util.List;

public class Notificador {

    public void notificar(List<Cliente> clientes, Produto produto){
        for(Cliente cliente: clientes){
            cliente.adicionarMensagem(
                    new Mensagem("Olá " +cliente.getNome() +
                                    " foi lançado um novo produto do seu interesse:"
                                    + produto.getNome())
            );
        }
    }
}
