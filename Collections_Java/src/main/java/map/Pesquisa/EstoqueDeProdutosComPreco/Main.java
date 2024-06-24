package main.java.map.Pesquisa.EstoqueDeProdutosComPreco;

public class Main {
    public static void main(String[] args) {
        // Criar instância de EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionar alguns produtos
        estoque.adicionarProduto(1, "Produto A", 10, 15.5);
        estoque.adicionarProduto(2, "Produto B", 5, 20.0);
        estoque.adicionarProduto(3, "Produto C", 20, 7.5);
        estoque.adicionarProduto(4, "Produto D", 8, 12.0);

        // Exibir todos os produtos
        System.out.println("Produtos no estoque:");
        estoque.exibirProutos();

        // Calcular e exibir o valor total do estoque
        double valorTotal = estoque.calcularValorTotalEstoque();
        System.out.println("\nValor total do estoque: R$ " + valorTotal);

        // Obter e exibir o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("\nProduto mais caro: " + produtoMaisCaro);

        // Obter e exibir o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obter e exibir o produto com maior quantidade de valor total no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade de valor total no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
