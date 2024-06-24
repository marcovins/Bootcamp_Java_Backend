package main.java.map.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagem;

    ContagemPalavras() {
        this.contagem = new HashMap<String, Integer>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagem.put(palavra, contagem);

    }

    public void removerPalavra(String palavra){
        if(this.contagem.isEmpty()) return;
        this.contagem.remove(palavra);
    }

    public void exibirContagemPalavras(){
        if(this.contagem.isEmpty()) return;
        for(String palavra : this.contagem.keySet()){
            System.out.println(palavra + " - " + this.contagem.get(palavra));
        }

    }

    public String encontrarPalavraMaisFrequente(){
        if(this.contagem.isEmpty()) return null;
        int maisFrequente = 0;
        String palavraMaisFrequente = null;

        for(String palavra : this.contagem.keySet()){
            if(this.contagem.get(palavra) > maisFrequente){
                maisFrequente = this.contagem.get(palavra);
                palavraMaisFrequente = palavra;
            }
        }

        return palavraMaisFrequente;
    }

}
