package main.java.list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.lang.Integer;

public class SomaNumeros {

    private ArrayList<Integer> numeros;

    SomaNumeros(){
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(Integer numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeros){
            soma += numero.intValue();
        }
    return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(Integer numero : numeros){
            if(numero.intValue() > maior){
                maior = numero.intValue();
            }
        }
        return maior;

    }

    public int encontrarMenorNumero(){
        int menor = encontrarMaiorNumero();
        for(Integer numero : numeros){
            if(numero.intValue() < menor){
                menor = numero.intValue();
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        for(Integer numero : numeros){
            System.out.println(numero.intValue());
        }
    }

}
