package com.banco.Cliente;

import com.banco.Contas.Conta;
import com.banco.Contas.ContaSalario;

public class Funcionario extends Cliente {

    private String cargo;
    private double salario;
    private ContaSalario contaPagamento;

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cargo, double salario) throws Exception {
        super(nome, null, null);  // Email e endereço não são necessários para funcionário
        this.cargo = cargo;
        this.salario = salario;
    }

    // Define a conta de recebimento do sálario
    public void setContaPagamento(ContaSalario contaPagamento) {
        this.contaPagamento = contaPagamento;
    }

    // Retorna o cargo do funcionário
    public String getCargo() {
        return cargo;
    }

    // Retorna o salário do funcionário
    public double getSalario() {
        return salario;
    }

    // Retorna a conta de pagamento do funcionário
    public Conta getContaPagamento() {
        return contaPagamento;
    }
}
