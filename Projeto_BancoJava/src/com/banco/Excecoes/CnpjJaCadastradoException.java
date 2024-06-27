package com.banco.Excecoes;

public class CnpjJaCadastradoException extends Exception {
    public CnpjJaCadastradoException(String cnpj) {
        super("O Cnpj " + cnpj + " já está cadastrado em outra conta.");
    }
}

