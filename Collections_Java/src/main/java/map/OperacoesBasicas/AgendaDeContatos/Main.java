package main.java.map.OperacoesBasicas.AgendaDeContatos;

public class Main {
    public static void main(String[] args) {
        // Criar instância de AgendaContatos
        AgendaContatos agenda = new AgendaContatos();

        // Adicionar alguns contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Carol", 555555555);

        // Exibir todos os contatos
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        // Pesquisar um contato por nome
        String nomePesquisa = "Bob";
        Integer numeroBob = agenda.pesquisarPorNome(nomePesquisa);
        if (numeroBob != null) {
            System.out.println("\nNúmero de " + nomePesquisa + ": " + numeroBob);
        } else {
            System.out.println("\nContato " + nomePesquisa + " não encontrado.");
        }

        // Remover um contato
        agenda.removerContato("Carol");
        System.out.println("\nContatos na agenda após remover Carol:");
        agenda.exibirContatos();
    }
}
