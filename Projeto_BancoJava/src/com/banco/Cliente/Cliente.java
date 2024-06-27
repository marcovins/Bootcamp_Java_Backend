package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Contas.Conta;
import com.banco.Excecoes.EmailJaCadastradoException;

public abstract class Cliente {

    protected String nome;
    protected String email;
    protected String endereco;
    protected Set<Conta> contas;
    protected static Set<String> emailsCadastrados = new HashSet<String>();

    Cliente(String nome, String email, String endereco) throws Exception{

        if(emailsCadastrados.contains(email) && email != null) {
            throw new EmailJaCadastradoException(email);
        }
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.contas = new HashSet<Conta>();
        emailsCadastrados.add(email);
        
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void removerConta(Conta conta){
        this.contas.remove(conta);
    }
    
}
