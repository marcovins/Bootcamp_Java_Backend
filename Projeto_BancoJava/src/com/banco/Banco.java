package com.banco;

import java.util.HashSet;
import java.util.Set;

import com.banco.Cliente.Cliente;

public class Banco {

    Set<Cliente> clientes;

    Banco() {
        this.clientes = new HashSet<Cliente>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(Cliente clienteBuscar ) {
        for (Cliente cliente : this.clientes) {
            if (cliente.equals(clienteBuscar)) {
                return cliente;
            }
        }
        return null;
    }

    public void removerCliente(Cliente cliente) {
        if(buscarCliente(cliente).equals(cliente)){
            this.clientes.remove(cliente);
        }
    }
     
    
}
