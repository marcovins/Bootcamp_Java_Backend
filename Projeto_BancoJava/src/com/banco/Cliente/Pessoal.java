package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Excecoes.CpfJaCadastradoException;
import com.banco.Excecoes.EmailJaCadastradoException;

public class Pessoal extends Cliente {

    private String cpf;
    private static Set<String> cpfsCadastrados = new HashSet<String>();

    // Construtor da classe Pessoal, verifica se o CPF já foi cadastrado
    public Pessoal(String nome, String email, String endereco, String cpf) throws CpfJaCadastradoException, EmailJaCadastradoException {
        super(nome, email, endereco);
        if (cpfsCadastrados.contains(cpf)) {
            throw new CpfJaCadastradoException(cpf);
        }
        this.cpf = cpf;
        cpfsCadastrados.add(cpf);
    }

    // Retorna o CPF da pessoa
    public String getCpf() {
        return cpf;
    }
}
