package main.java.set.Ordenacao.CadastroDeProdutos;


public class Main {
    public static void main(String[] args) {
        // Criar instância de CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionar alguns produtos
        cadastroProdutos.adicionarProduto(12345, "Mouse", 29.99, 50);
        cadastroProdutos.adicionarProduto(67890, "Teclado", 79.99, 30);
        cadastroProdutos.adicionarProduto(54321, "Monitor", 399.99, 10);
        cadastroProdutos.adicionarProduto(98765, "Fone de Ouvido", 99.99, 20);

        // Exibir produtos ordenados por nome
        System.out.println("Produtos ordenados por nome:");
        cadastroProdutos.exibirProdutosPorNome();

        // Exibir produtos ordenados por preço
        System.out.println("\nProdutos ordenados por preço:");
        cadastroProdutos.exibirProdutosPorPreco();
    }

}
