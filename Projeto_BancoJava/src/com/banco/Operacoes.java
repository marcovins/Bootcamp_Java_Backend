package com.banco;

import com.banco.Contas.Conta;

public interface Operacoes {
    
    // Método para sacar um valor da conta, pode lançar uma exceção
    void sacar(double valor) throws Exception;
    
    // Método para depositar um valor na conta
    void depositar(double valor);

    // Método para transferir um valor para outra conta, pode lançar uma exceção
    void transferir(double valor, Conta destino) throws Exception;
}
