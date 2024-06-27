package com.banco.Contas;

import java.time.LocalTime;

import com.banco.Cliente.Funcionario;
import com.banco.Excecoes.ContaInvalidaException;
import com.banco.Excecoes.InsufficientFundsException;

public class ContaSalario extends Conta{

    
    ContaSalario(String agencia, Funcionario funcionario) {
        super(agencia, funcionario);
    }

    @Override
    public String tipoConta() {
        return "ContaSalario";
    }

    @Override
    public void sacar(double valor) throws Exception {
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
    public void transferir(double valor, Conta destino) throws Exception {
        if (valor > (this.getSaldo() + 1)){
            throw new InsufficientFundsException("Saldo insuficiente para realizar a transferência de: " + valor );
        }

        if (destino.getCliente().equals(this.getCliente())) {
            this.saldo -= (valor + 1);
            destino.saldo += valor;
            this.extrato += ("Transferência para " + destino.getCliente().getNome() + "no valor de: " + valor + " - " + LocalTime.now().toString());
            
        }
        else{
            throw new ContaInvalidaException();
        }

    }

}
