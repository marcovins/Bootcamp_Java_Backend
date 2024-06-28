package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Excecoes.CnpjJaCadastradoException;
import com.banco.Excecoes.EmailJaCadastradoException;

public class Empresa extends Cliente {

    private String cnpj;
    private Set<Funcionario> funcionarios;
    protected static Set<String> cnpjsCadastrados = new HashSet<String>();

    // Construtor da classe Empresa, verifica se o CNPJ já foi cadastrado
    public Empresa(String nome, String email, String endereco, String cnpj) throws CnpjJaCadastradoException, EmailJaCadastradoException {
        super(nome, email, endereco);
        if (cnpjsCadastrados.contains(cnpj)) {
            throw new CnpjJaCadastradoException(cnpj);
        }
        this.cnpj = cnpj;
        this.funcionarios = new HashSet<Funcionario>();
        cnpjsCadastrados.add(cnpj);
    }

    // Retorna o CNPJ da empresa
    public String getCnpj() {
        return cnpj;
    }

    // Retorna o conjunto de funcionários da empresa
    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Adiciona um funcionário ao conjunto de funcionários da empresa
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Remove um funcionário do conjunto de funcionários da empresa
    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
}
