package com.banco.Contas;

import java.util.HashMap;
import java.util.Map;

public class MapaDeGastos {
    private Map<String, Double> gastos;
    
    // Construtor da classe MapaDeGastos
    MapaDeGastos(){
        this.gastos = new HashMap<>();
        this.gastos.put("Alimentação", 0.0);
        this.gastos.put("Transporte", 0.0);
        this.gastos.put("Lazer", 0.0);
        this.gastos.put("Saúde", 0.0);
    }

    // Método para exibir os gastos
    public void exibirGastos(){
        System.out.println(gastos.toString());
    }

    // Método para adicionar um gasto em uma categoria específica
    public void adicionarGasto(String categoria, double valor){
        gastos.put(categoria, gastos.getOrDefault(categoria, 0.0) + valor);
    }

    // Sobrescrevendo o método toString para formatar a exibição dos gastos
    @Override
    public String toString() {
        return 
            "            MapaDeGastos            \n" +
            "Alimentação: " + gastos.get("Alimentação") + "\n" +
            "Transporte: " + gastos.get("Transporte") + "\n" +
            "Lazer: " + gastos.get("Lazer") + "\n" +
            "Saúde: " + gastos.get("Saúde") + "\n";
    }
}
