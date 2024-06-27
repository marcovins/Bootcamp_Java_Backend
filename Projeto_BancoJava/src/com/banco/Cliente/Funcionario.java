package com.banco.Cliente;

import com.banco.Contas.Conta;
import com.banco.Contas.ContaSalario;

public class Funcionario extends Cliente{

    private String nome;
    private String cargo;
    private double salario;
    private ContaSalario contaPagamento;

    Funcionario(String nome, String cargo, double salario, ContaSalario conta) throws Exception{
        super(nome, null, null);  // email e endereço não são necessários para funcionário
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.contaPagamento = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public Conta getContaPagamento() {
        return contaPagamento;
    }

}
