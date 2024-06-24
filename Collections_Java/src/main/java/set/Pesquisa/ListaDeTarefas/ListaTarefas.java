package main.java.set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    ListaTarefas() {
        this.tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = new Tarefa(descricao);
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getDescricao().equals(descricao)) {
                tarefaRemover = tarefa;
                break;
            }     
        }
        this.tarefas.remove(tarefaRemover);
        
    }

    public void exibirTarefas(){
        for (Tarefa tarefa : this.tarefas) {
            System.out.println(tarefa.toString());
        }
    }

    public int contarTarefas(){
        return this.tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();
        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.getConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();
        for (Tarefa tarefa : this.tarefas) {
            if(!tarefa.getConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa : this.tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida();
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa : this.tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setPendente();
                break;
            }
        }
    }

    public void limparListaTaredas(){
        this.tarefas.clear();
    }

}
