package main.java.map.OperacoesBasicas.Dicionario;

public class Main {
    public static void main(String[] args) {
        // Criar instância de Dicionario
        Dicionario dicionario = new Dicionario();

        // Adicionar algumas palavras
        dicionario.adicionarPalavra("Java", "Uma linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Python", "Uma linguagem de programação interpretada, interativa e orientada a objetos.");
        dicionario.adicionarPalavra("JavaScript", "Uma linguagem de programação utilizada para desenvolver aplicações web.");

        // Exibir todas as palavras e suas definições
        System.out.println("Dicionário:");
        dicionario.exibirPalavras();

        // Pesquisar uma palavra
        String palavraPesquisa = "Python";
        String definicao = dicionario.pesquisarPorPalavra(palavraPesquisa);
        if (definicao != null) {
            System.out.println("\nDefinição de " + palavraPesquisa + ": " + definicao);
        } else {
            System.out.println("\nPalavra " + palavraPesquisa + " não encontrada.");
        }

        // Remover uma palavra
        dicionario.removerPalavra("JavaScript");
        System.out.println("\nDicionário após remover 'JavaScript':");
        dicionario.exibirPalavras();
    }
}
