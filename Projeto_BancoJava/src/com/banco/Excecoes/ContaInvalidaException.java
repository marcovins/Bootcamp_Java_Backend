package com.banco.Excecoes;

public class ContaInvalidaException extends Exception {
    public ContaInvalidaException() {
        super("A Conta destino da transferência deve ter o mesmo proprietário.");
    }
}
