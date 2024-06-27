package com.banco.Excecoes;

public class CpfJaCadastradoException extends Exception {
    public CpfJaCadastradoException(String cpf) {
        super("O Cpf " + cpf + " já está cadastrado em outra conta.");
    }
}

