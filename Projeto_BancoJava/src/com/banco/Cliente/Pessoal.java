package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Excecoes.CpfJaCadastradoException;

public class Pessoal extends Cliente {

    private String cpf;
    private static Set<String> cpfsCadastrados =  new HashSet<String>();

    Pessoal(String nome, String email, String endereco, String cpf) throws Exception {
        super(nome, email, endereco);
        if (cpfsCadastrados.contains(cpf)) {
            throw new CpfJaCadastradoException(cpf);
        }
        this.cpf = cpf;
        cpfsCadastrados.add(cpf);
    }

    public String getCpf() {
        return cpf;
    }

}
