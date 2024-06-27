package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Cliente;
import com.banco.Excecoes.DailyWithdrawalLimitExceededException;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaCorrente extends Conta{

    private double chequeEspecial;
    private double limiteCredito;
    private int limiteSaques;

    ContaCorrente(String agencia, Cliente cliente){
        super(agencia, cliente);
        this.chequeEspecial = 0.0;
        this.limiteCredito = 0.0;
        this.limiteSaques = 3;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public int getLimiteSaques() {
        return limiteSaques;
    }

    private void setCredito(){
        this.limiteCredito = this.getSaldo() * 2;
        this.chequeEspecial = this.getSaldo() * 0.1;
    }

    @Override
    public String tipoConta() {
        return "ContaCorrente";
    }


    @Override
    public void sacar(double valor) throws Exception {
        if (valor > (this.getSaldo() + 0.5)){
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque de: " + valor );
            }
        if(this.getLimiteSaques() == 0) {
            throw new DailyWithdrawalLimitExceededException("Limite de saques diários excedido!");    
        }
        this.saldo -= (valor + 0.5);
        setCredito();
        this.extrato += ("Saque de " + valor + " - " + LocalTime.now().toString());
    }

    @Override
    public void depositar(double valor) {
        this.saldo += (valor - 0.5);
        setCredito();
        this.extrato += ("Deposito de " + valor + " - " + LocalTime.now().toString());
    }

    @Override
    public void transferir(double valor, Conta destino) throws InsufficientFundsException {
        if (valor > (this.getSaldo() + 1)){
            throw new InsufficientFundsException("Saldo insuficiente para realizar a transferência de: " + valor );
        }

        this.saldo -= (valor + 1);
        destino.saldo += valor;
        setCredito();
        this.extrato += ("Transferência para " + destino.getCliente().getNome() + "no valor de: " + valor + " - " + LocalTime.now().toString());
    }

}
