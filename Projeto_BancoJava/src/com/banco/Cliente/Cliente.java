package com.banco.Cliente;

import java.util.HashSet;
import java.util.Set;

import com.banco.Contas.Conta;
import com.banco.Excecoes.EmailJaCadastradoException;

public abstract class Cliente {

    // Atributos protegidos para que possam ser acessados pelas subclasses
    protected String nome;
    protected String email;
    protected String endereco;
    protected Set<Conta> contas;
    protected static Set<String> emailsCadastrados = new HashSet<String>();

    // Construtor da classe Cliente, verifica se o email já foi cadastrado
    public Cliente(String nome, String email, String endereco) throws EmailJaCadastradoException {
        // Verifica se o email já está cadastrado e se é válido
        if (emailsCadastrados.contains(email) && email != null) {
            throw new EmailJaCadastradoException(email);
        }
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.contas = new HashSet<Conta>();
        emailsCadastrados.add(email);        
    }

    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Retorna o email do cliente
    public String getEmail() {
        return email;
    }

    // Retorna o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Retorna o conjunto de contas do cliente
    public Set<Conta> getContas() {
        return contas;
    }

    // Adiciona uma conta ao conjunto de contas do cliente
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    // Remove uma conta do conjunto de contas do cliente
    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }    
}
