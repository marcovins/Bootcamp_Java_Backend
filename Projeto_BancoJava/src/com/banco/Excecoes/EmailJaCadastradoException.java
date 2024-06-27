package com.banco.Excecoes;

public class EmailJaCadastradoException extends Exception {
    public EmailJaCadastradoException(String email) {
        super("O email " + email + " já está cadastrado em outra conta.");
    }
}

