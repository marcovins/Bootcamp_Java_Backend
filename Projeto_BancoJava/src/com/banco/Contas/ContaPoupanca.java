package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Cliente;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaPoupanca extends Conta{
    
    private static final double TAXA_RENDIMENTO = 0.01;

    ContaPoupanca(String agencia, Cliente cliente){
        super(agencia, cliente);
        this.saldo = 0.0;
    }

    public void aplicarTaxa() {
        this.saldo += (this.saldo * TAXA_RENDIMENTO);
        this.extrato += ("Rendimento de " + this.saldo * TAXA_RENDIMENTO + " - " + LocalTime.now().toString());
    }

    @Override
    public void sacar(double valor) throws InsufficientFundsException {
        if (valor > (this.getSaldo() + 0.5)){
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque de: " + valor );
        }
        this.saldo -= (valor + 0.5);
        this.extrato += ("Saque de " + valor + " - " + LocalTime.now().toString());
    }

    @Override
    public void depositar(double valor) {
        this.saldo += (valor - 0.5);
        this.extrato += ("Deposito de " + valor + " - " + LocalTime.now().toString());
    }

    @Override
    public void transferir(double valor, Conta destino) throws InsufficientFundsException {
        if (valor > (this.getSaldo() + 1)){
            throw new InsufficientFundsException("Saldo insuficiente para realizar a transferência de: " + valor );
        }

        this.saldo -= (valor + 1);
        destino.saldo += valor;
        this.extrato += ("Transferência para " + destino.getCliente().getNome() + "no valor de: " + valor + " - " + LocalTime.now().toString());
    }

    @Override
    public String tipoConta() {
        return "ContaPoupanca";
    }


}
