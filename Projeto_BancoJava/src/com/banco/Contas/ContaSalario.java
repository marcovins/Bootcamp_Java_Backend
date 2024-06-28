package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Funcionario;
import com.banco.Excecoes.ContaInvalidaException;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaSalario extends Conta {

    // Construtor da classe ContaSalario
    public ContaSalario(String agencia, Funcionario funcionario) {
        super(agencia, funcionario);
    }

    // Método para retornar o tipo da conta
    @Override
    public String tipoConta() {
        return "ContaSalario";
    }

    // Método para realizar saque na conta salário
    @Override
    public void sacar(double valor) throws Exception {
        // Verifica se o valor do saque é maior que o saldo disponível mais a taxa de operação
        if (valor > (this.getSaldo() + 0.5)) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque de: " + valor);
        }
        // Realiza o saque deduzindo o valor e a taxa de operação
        this.saldo -= (valor + 0.5);
        // Registra no extrato o saque realizado
        this.extrato += ("Saque de " + valor + " - " + LocalTime.now().toString());
    }

    // Método para realizar depósito na conta salário
    @Override
    public void depositar(double valor) {
        // Realiza o depósito adicionando o valor ao saldo e deduzindo a taxa de operação
        this.saldo += (valor - 0.5);
        // Registra no extrato o depósito realizado
        this.extrato += ("Depósito de " + valor + " - " + LocalTime.now().toString());
    }

    // Método para realizar transferência entre contas
    @Override
    public void transferir(double valor, Conta destino) throws Exception {
        // Verifica se o valor da transferência é maior que o saldo disponível mais a taxa de operação
        if (valor > (this.getSaldo() + 1)) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar a transferência de: " + valor);
        }

        // Verifica se a conta de destino pertence ao mesmo cliente da conta salário
        if (destino.getCliente().equals(this.getCliente())) {
            // Realiza a transferência deduzindo o valor e a taxa de operação da conta de origem
            this.saldo -= (valor + 1);
            // Adiciona o valor transferido à conta de destino
            destino.saldo += valor;
            // Registra no extrato a transferência realizada
            this.extrato += ("Transferência para " + destino.getCliente().getNome() + " no valor de: " + valor + " - " + LocalTime.now().toString());
        } else {
            // Lança uma exceção caso a conta de destino não pertença ao mesmo cliente da conta salário
            throw new ContaInvalidaException();
        }
    }

}
