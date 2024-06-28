package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Cliente;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.01;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(String agencia, Cliente cliente) {
        super(agencia, cliente);
        this.saldo = 0.0; // Saldo inicial da poupança é zero
    }

    // Método para aplicar a taxa de rendimento na poupança
    public void aplicarTaxa() {
        this.saldo += (this.saldo * TAXA_RENDIMENTO); // Aplica a taxa de rendimento ao saldo
        this.extrato += ("Rendimento de " + this.saldo * TAXA_RENDIMENTO + " - " + LocalTime.now().toString()); // Registra o rendimento no extrato
    }

    // Método para realizar saque na conta poupança
    @Override
    public void sacar(double valor) throws InsufficientFundsException {
        // Verifica se o valor do saque é maior que o saldo disponível mais a taxa de operação
        if (valor > (this.getSaldo() + 0.5)) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque de: " + valor);
        }
        // Realiza o saque deduzindo o valor e a taxa de operação
        this.saldo -= (valor + 0.5);
        // Registra no extrato o saque realizado
        this.extrato += ("Saque de " + valor + " - " + LocalTime.now().toString());
    }

    // Método para realizar depósito na conta poupança
    @Override
    public void depositar(double valor) {
        // Realiza o depósito adicionando o valor ao saldo e deduzindo a taxa de operação
        this.saldo += (valor - 0.5);
        // Registra no extrato o depósito realizado
        this.extrato += ("Depósito de " + valor + " - " + LocalTime.now().toString());
    }

    // Método para realizar transferência entre contas
    @Override
    public void transferir(double valor, Conta destino) throws InsufficientFundsException {
        // Verifica se o valor da transferência é maior que o saldo disponível mais a taxa de operação
        if (valor > (this.getSaldo() + 1)) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar a transferência de: " + valor);
        }

        // Realiza a transferência deduzindo o valor e a taxa de operação da conta de origem
        this.saldo -= (valor + 1);
        // Adiciona o valor transferido à conta de destino
        destino.saldo += valor;
        // Registra no extrato a transferência realizada
        this.extrato += ("Transferência para " + destino.getCliente().getNome() + " no valor de: " + valor + " - " + LocalTime.now().toString());
    }

    // Método para retornar o tipo da conta
    @Override
    public String tipoConta() {
        return "ContaPoupanca";
    }
}
