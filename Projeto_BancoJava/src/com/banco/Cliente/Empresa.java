package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Excecoes.CnpjJaCadastradoException;

public class Empresa extends Cliente {

    private String cnpj;
    private Set<Funcionario> funcionarios;
    protected static Set<String> cnpjsCadastrados = new HashSet<String>();

    Empresa(String nome, String email, String endereco, String cnpj) throws Exception {
            super(nome, email, endereco);
            if (cnpjsCadastrados.contains(cnpj)) {
                throw new CnpjJaCadastradoException(cnpj);
            }
            this.cnpj = cnpj;
            this.funcionarios = new HashSet<Funcionario>();
            cnpjsCadastrados.add(cnpj);
    }
        

    public String getCnpj() {
        return cnpj;
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario Funcionario){
        funcionarios.add(Funcionario);
    }

    public void removerFuncionario(Funcionario Funcionario){
        funcionarios.remove(Funcionario);
    }

}
