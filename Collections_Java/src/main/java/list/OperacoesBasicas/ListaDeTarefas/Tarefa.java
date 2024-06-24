package main.java.list.OperacoesBasicas.ListaDeTarefas;

public class Tarefa {
    private String description;

    Tarefa(String description){
        this.description = description;
    };

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
