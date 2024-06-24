package main.java.set.Pesquisa.ListaDeTarefas;

public class Main {
    public static void main(String[] args) {
        // Criar instância de ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionar tarefas à lista
        listaTarefas.adicionarTarefa("Comprar leite");
        listaTarefas.adicionarTarefa("Enviar relatório");
        listaTarefas.adicionarTarefa("Estudar para prova");
        listaTarefas.adicionarTarefa("Lavar o carro");

        // Exibir todas as tarefas
        System.out.println("Lista de Tarefas:");
        listaTarefas.exibirTarefas();

        // Marcar uma tarefa como concluída
        listaTarefas.marcarTarefaConcluida("Enviar relatório");
        System.out.println("\nLista de Tarefas após marcar 'Enviar relatório' como concluída:");
        listaTarefas.exibirTarefas();

        // Exibir tarefas concluídas
        System.out.println("\nTarefas Concluídas:");
        for (Tarefa tarefa : listaTarefas.obterTarefasConcluidas()) {
            System.out.println(tarefa.toString());
        }

        // Exibir tarefas pendentes
        System.out.println("\nTarefas Pendentes:");
        for (Tarefa tarefa : listaTarefas.obterTarefasPendentes()) {
            System.out.println(tarefa.toString());
        }

        // Remover uma tarefa
        listaTarefas.removerTarefa("Lavar o carro");
        System.out.println("\nLista de Tarefas após remover 'Lavar o carro':");
        listaTarefas.exibirTarefas();

        // Contar o número de tarefas
        int totalTarefas = listaTarefas.contarTarefas();
        System.out.println("\nTotal de Tarefas: " + totalTarefas);

        // Limpar a lista de tarefas
        listaTarefas.limparListaTaredas();
        System.out.println("\nLista de Tarefas após limpar todas as tarefas:");
        listaTarefas.exibirTarefas();
    }
}
