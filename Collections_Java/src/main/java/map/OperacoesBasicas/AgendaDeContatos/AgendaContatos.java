package main.java.map.OperacoesBasicas.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agenda;
    
    AgendaContatos() {
        this.agenda = new HashMap<String, Integer>();
    }

    public void adicionarContato(String nome, Integer numero) {
        this.agenda.put(nome, numero);
    }

    public void removerContato(String nome) {
        if(!agenda.isEmpty()){
            this.agenda.remove(nome);
        }
    }

    public void exibirContatos(){
        for(String nome : this.agenda.keySet()){
            System.out.println(nome + " - " + this.agenda.get(nome));
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agenda.isEmpty()){
            numeroPorNome = this.agenda.get(nome);
        }
        return numeroPorNome;
    } 

}
