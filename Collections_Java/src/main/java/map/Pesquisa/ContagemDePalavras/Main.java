package main.java.map.Pesquisa.ContagemDePalavras;

public class Main {
    public static void main(String[] args) {
        // Criar instância de ContagemPalavras
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adicionar algumas palavras com suas contagens
        contagemPalavras.adicionarPalavra("Java", 10);
        contagemPalavras.adicionarPalavra("Python", 7);
        contagemPalavras.adicionarPalavra("C++", 5);
        contagemPalavras.adicionarPalavra("JavaScript", 12);

        // Exibir a contagem de palavras
        System.out.println("Contagem de palavras:");
        contagemPalavras.exibirContagemPalavras();

        // Encontrar e exibir a palavra mais frequente
        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("\nPalavra mais frequente: " + palavraMaisFrequente);

        // Remover uma palavra
        contagemPalavras.removerPalavra("Python");

        // Exibir a contagem de palavras após a remoção
        System.out.println("\nContagem de palavras após a remoção de 'Python':");
        contagemPalavras.exibirContagemPalavras();

        // Adicionar mais uma palavra
        contagemPalavras.adicionarPalavra("Go", 3);

        // Exibir a contagem de palavras após adicionar nova palavra
        System.out.println("\nContagem de palavras após adicionar 'Go':");
        contagemPalavras.exibirContagemPalavras();
    }
}
