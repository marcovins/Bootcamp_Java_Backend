package main.java.set.Pesquisa.ListaDeTarefas;

public class Tarefa {

    private String descricao;
    private boolean status = false;

    Tarefa(String descricao) {
        this.descricao = descricao;
        
    }


    public String getDescricao() {
        return this.descricao;
    }

    public boolean getConcluida() {
        return this.status;
    }

    public void setConcluida() {
        this.status = true;
    }

    public void setPendente() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "Descrição='" + descricao + '\'' +
                ", Status=" + ((status)? "Concluida" : "Pendente") +
                '}';
    }


}
