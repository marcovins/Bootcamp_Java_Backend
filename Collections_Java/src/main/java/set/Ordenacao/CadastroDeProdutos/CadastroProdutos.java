package main.java.set.Ordenacao.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    CadastroProdutos(){
        this.produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        Produto produto = new Produto(cod, nome, preco, quantidade);
        this.produtos.add(produto);
    }

    public void exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<Produto>(produtos);
        this.exibirProdutos(produtosPorNome);
    }

    public void exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtos);
        this.exibirProdutos(produtosPorPreco);

    }

    private void exibirProdutos(Set<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
