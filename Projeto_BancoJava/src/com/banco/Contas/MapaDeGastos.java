package com.banco.Contas;

import java.util.Map;
import java.util.HashMap;

public class MapaDeGastos {
    private Map<String, Double> gastos;
    
    MapaDeGastos(){
        this.gastos = new HashMap<String, Double>();
        this.gastos.put("Alimentação", 0.0);
        this.gastos.put("Transporte", 0.0);
        this.gastos.put("Lazer", 0.0);
        this.gastos.put("Saúde", 0.0);
    }

    public void exibirGastos(){
        System.out.println(gastos.toString());
    }

    public void adicionarGasto(String categoria, double valor){
        gastos.put(categoria, gastos.get(categoria) + valor);
    }

    @Override
    public String toString() {
        return 
        "            MapaDeGastos            \n" +
        "Alimentação:" + gastos.get("Alimentação") +
        "Transporte:" + gastos.get("Transporte") +
        "Lazer:" + gastos.get("Lazer") +
        "Saúde:" + gastos.get("Saúde");

    }
}
