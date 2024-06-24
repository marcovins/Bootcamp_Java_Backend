package main.java.set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        // Criar instância de ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionar palavras ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("apple");
        conjuntoPalavrasUnicas.adicionarPalavra("banana");
        conjuntoPalavrasUnicas.adicionarPalavra("orange");
        conjuntoPalavrasUnicas.adicionarPalavra("grape");

        // Exibir todas as palavras únicas
        System.out.println("Palavras únicas no conjunto:");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Verificar se uma palavra está no conjunto
        String palavraParaVerificar = "banana";
        boolean existe = conjuntoPalavrasUnicas.verificarPalavra(palavraParaVerificar);
        System.out.println("\nA palavra '" + palavraParaVerificar + "' está no conjunto? " + existe);

        // Remover uma palavra do conjunto
        conjuntoPalavrasUnicas.removerPalavra("orange");
        System.out.println("\nPalavras únicas no conjunto após remover 'orange':");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Verificar se uma palavra foi removida
        palavraParaVerificar = "orange";
        existe = conjuntoPalavrasUnicas.verificarPalavra(palavraParaVerificar);
        System.out.println("\nA palavra '" + palavraParaVerificar + "' está no conjunto? " + existe);
    }
}
