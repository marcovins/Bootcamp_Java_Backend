package com.banco.Contas;

import com.banco.Operacoes;
import com.banco.Cliente.Cliente;

public abstract class Conta implements Operacoes{

    protected double saldo;
    protected String agencia;
    protected Cliente cliente;
    protected String extrato;
    protected MapaDeGastos mapaDeGastos;

    Conta(String agencia, Cliente cliente){
        this.saldo = 0.0;
        this.agencia = agencia;
        this.cliente = cliente;
        this.mapaDeGastos = new MapaDeGastos();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void exibirExtrato(){
        System.out.println(this.extrato);
    }
    
    public abstract String tipoConta();


}
