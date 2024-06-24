package main.java.list.OperacoesBasicas.ListaDeTarefas;

public class Main {
    public static void main(String[] args) {
        // Criar instância de ListaTarefas
        ListaTarefas lista = new ListaTarefas();

        // Criar algumas tarefas
        Tarefa tarefa1 = new Tarefa("Comprar mantimentos.");
        Tarefa tarefa2 = new Tarefa("Estudar para o exame.");
        Tarefa tarefa3 = new Tarefa("Limpar a casa.");

        // Adicionar tarefas à lista
        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);

        // Exibir número total de tarefas
        System.out.println("Número total de tarefas: " + lista.obterNumeroTotalTarefas());

        // Exibir descrições das tarefas
        System.out.println("Descrições das tarefas:");
        for (String descricao : lista.obterDescricoesTarefas()) {
            System.out.println(descricao);
        }

        // Remover uma tarefa
        lista.removerTarefa(tarefa2);

        // Exibir número total de tarefas após remoção
        System.out.println("Número total de tarefas após remoção: " + lista.obterNumeroTotalTarefas());

        // Exibir descrições das tarefas após remoção
        System.out.println("Descrições das tarefas após remoção:");
        for (String descricao : lista.obterDescricoesTarefas()) {
            System.out.println(descricao);
        }
    }
}
