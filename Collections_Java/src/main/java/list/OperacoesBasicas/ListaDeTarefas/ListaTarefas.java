package main.java.list.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList; 

public class ListaTarefas {
    
    ArrayList<Tarefa> lista_tarefas;

    ListaTarefas(){
        this.lista_tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        this.lista_tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa){
        this.lista_tarefas.remove(tarefa);
    }

    public int obterNumeroTotalTarefas(){
        return this.lista_tarefas.size();
    }

    public ArrayList<String> obterDescricoesTarefas(){
        ArrayList<String> lista = new ArrayList<String>();
        for(Tarefa tarefa : this.lista_tarefas){
            lista.add(tarefa.getDescription());
        }
        return lista;
    }
}
