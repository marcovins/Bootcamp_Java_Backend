package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        // Criar instância de CarrinhoDeCompras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionar itens ao carrinho
        carrinho.adicionarItem(new Item("Arroz", 20.50, 2));
        carrinho.adicionarItem("Feijão", 7.30, 5);
        carrinho.adicionarItem(new Item("Macarrão", 4.75, 3));

        // Exibir itens no carrinho
        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        // Calcular e exibir o valor total dos itens no carrinho
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        // Remover um item do carrinho
        carrinho.removerItem("Feijão");

        // Exibir itens no carrinho após remoção
        System.out.println("Itens no carrinho após remoção:");
        carrinho.exibirItens();

        // Calcular e exibir o valor total dos itens no carrinho após remoção
        System.out.println("Valor total após remoção: " + carrinho.calcularValorTotal());
    }
}
