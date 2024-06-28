package com.banco;

import java.util.HashSet;
import java.util.Set;

import com.banco.Cliente.Cliente;

public class Banco {
    // Conjunto de clientes do banco
    Set<Cliente> clientes;

    // Construtor da classe Banco, inicializa o conjunto de clientes
    public Banco() {
        this.clientes = new HashSet<Cliente>();
    }

    // Adiciona um cliente ao conjunto de clientes
    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // Busca um cliente no conjunto de clientes, retornando o cliente se encontrado, caso contrário, retorna null
    public Cliente buscarCliente(Cliente clienteBuscar) {
        for (Cliente cliente : this.clientes) {
            if (cliente.equals(clienteBuscar)) {
                return cliente;
            }
        }
        return null;
    }

    // Remove um cliente do conjunto de clientes, se o cliente for encontrado
    public void removerCliente(Cliente cliente) {
        // Verifica se o cliente existe no conjunto antes de removê-lo
        Cliente clienteEncontrado = buscarCliente(cliente);
        if (clienteEncontrado != null && clienteEncontrado.equals(cliente)) {
            this.clientes.remove(cliente);
        }
    }
}
