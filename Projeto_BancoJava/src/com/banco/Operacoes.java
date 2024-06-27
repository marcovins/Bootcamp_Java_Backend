package com.banco;

import com.banco.Contas.Conta;

public interface Operacoes {
    
    void sacar(double valor) throws Exception ;
    
    void depositar(double valor);

    void transferir(double valor, Conta destino) throws Exception;

}
