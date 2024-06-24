package main.java.set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new java.util.HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return this.palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        for(String palavra : this.palavrasUnicas){
            System.out.println(palavra);
        }
    }

}
