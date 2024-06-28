package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Cliente;
import com.banco.Excecoes.DailyWithdrawalLimitExceededException;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaCorrente extends Conta {

    private double chequeEspecial;
    private double limiteCredito;
    private int limiteSaques;

    // Construtor da classe ContaCorrente
    public ContaCorrente(String agencia, Cliente cliente) {
        super(agencia, cliente);
        this.chequeEspecial = 0.0;
        this.limiteCredito = 0.0;
        this.limiteSaques = 3; // Definindo o limite inicial de saques diários
    }

    // Método para obter o valor do cheque especial
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    // Método para obter o limite de crédito
    public double getLimiteCredito() {
        return limiteCredito;
    }

    // Método para obter o número máximo de saques diários permitidos
    public int getLimiteSaques() {
        return limiteSaques;
    }

    // Método privado para atualizar o limite de crédito com base no saldo da conta
    private void setCredito() {
        this.limiteCredito = this.getSaldo() * 2; // Limite de crédito é o dobro do saldo
        this.chequeEspecial = this.getSaldo() * 0.1; // Cheque especial é 10% do saldo
    }

    // Método para retornar o tipo da conta
    @Override
    public String tipoConta() {
        return "ContaCorrente";
    }

    // Método para realizar saque na conta corrente
    @Override
    public void sacar(double valor) throws Exception {
        // Verifica se o valor do saque é maior que o saldo disponível mais a taxa de operação
        if (valor > (this.getSaldo() + 0.5)) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque de: " + valor);
        }
        // Verifica se o limite diário de saques foi atingido
        if (this.getLimiteSaques() == 0) {
            throw new DailyWithdrawalLimitExceededException("Limite de saques diários excedido!");
        }
        // Realiza o saque deduzindo o valor e a taxa de operação
        this.saldo -= (valor + 0.5);
        // Atualiza o limite de crédito e o cheque especial
        setCredito();
        // Registra no extrato o saque realizado
        this.extrato += ("Saque de " + valor + " - " + LocalTime.now().toString());
        // Decrementa o limite de saques diários
        this.limiteSaques--;
    }

    // Método para realizar depósito na conta corrente
    @Override
    public void depositar(double valor) {
        // Realiza o depósito adicionando o valor ao saldo e deduzindo a taxa de operação
        this.saldo += (valor - 0.5);
        // Atualiza o limite de crédito e o cheque especial
        setCredito();
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
        // Atualiza o limite de crédito e o cheque especial da conta de origem
        setCredito();
        // Registra no extrato a transferência realizada
        this.extrato += ("Transferência para " + destino.getCliente().getNome() + " no valor de: " + valor + " - " + LocalTime.now().toString());
    }

}
