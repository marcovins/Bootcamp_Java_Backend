package com.banco.Contas;

import com.banco.Operacoes;
import com.banco.Cliente.Cliente;

public abstract class Conta implements Operacoes {

    protected double saldo;
    protected String agencia;
    protected Cliente cliente;
    protected String extrato;
    protected MapaDeGastos mapaDeGastos;

    // Construtor da classe Conta
    public Conta(String agencia, Cliente cliente) {
        this.saldo = 0.0;
        this.agencia = agencia;
        this.cliente = cliente;
        this.mapaDeGastos = new MapaDeGastos();
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para obter a agência da conta
    public String getAgencia() {
        return agencia;
    }

    // Método para obter o cliente da conta
    public Cliente getCliente() {
        return cliente;
    }

    // Método para ober o mapa de gastos da conta
    public MapaDeGastos getMapaDeGastos() {
        return mapaDeGastos;
    }
    
    // Método para exibir o extrato da conta
    public void exibirExtrato() {
        System.out.println(this.extrato);
    }
    
    // Método abstrato para obter o tipo da conta (deve ser implementado pelas subclasses)
    public abstract String tipoConta();

}
