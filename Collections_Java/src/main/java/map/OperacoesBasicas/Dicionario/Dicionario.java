package main.java.map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> meuDicionario;
    
    Dicionario() {
        this.meuDicionario = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.meuDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.meuDicionario.remove(palavra);
    }

    public void exibirPalavras(){
        for(String palavra : this.meuDicionario.keySet()){
            System.out.println(palavra + " - " + this.meuDicionario.get(palavra));
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraRetornada = null;
        if(!this.meuDicionario.isEmpty()){
            palavraRetornada = this.meuDicionario.get(palavra);
        }
        return palavraRetornada;
    }

}
