package main.java.set.Pesquisa.AgendaDeContatos;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criar instância de AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos à agenda
        agendaContatos.adicionarContato("Alice", 123456789);
        agendaContatos.adicionarContato("Bob", 987654321);
        agendaContatos.adicionarContato("Charlie", 555555555);
        agendaContatos.adicionarContato(new Contato("Diana", 444444444));

        // Exibir todos os contatos
        System.out.println("Lista de Contatos:");
        agendaContatos.exibirContatos();

        // Pesquisar contatos por nome
        String nomeParaPesquisar = "Alice";
        Set<Contato> contatosEncontrados = agendaContatos.pesquisarPorNome(nomeParaPesquisar);
        System.out.println("\nContatos encontrados com o nome '" + nomeParaPesquisar + "':");
        for (Contato contato : contatosEncontrados) {
            System.out.println(contato.toString());
        }

        // Atualizar número de contato
        String nomeParaAtualizar = "Bob";
        int novoNumero = 111111111;
        agendaContatos.atualizarNumeroContato(nomeParaAtualizar, novoNumero);
        System.out.println("\nLista de Contatos após atualizar o número de " + nomeParaAtualizar + ":");
        agendaContatos.exibirContatos();
    }
}
