package main.java.map.Pesquisa.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    EstoqueProdutos(){
        this.estoque = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        this.estoque.put(cod, produto);
    }

    public void adicionarProduto(long cod, Produto produto){
        this.estoque.put(cod, produto);
    }

    public void exibirProutos(){
        for(Produto produto : this.estoque.values()){
            System.out.println(produto.toString());
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if(!this.estoque.isEmpty()){
            for(Produto produto : this.estoque.values()){
                valorTotal += (produto.getPreco() * produto.getQuantidade());
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        if(this.estoque.isEmpty())return null;
        double maisCaro = 0;
        long produtoMaisCaro = 0;
        
        for(Long produto : this.estoque.keySet()){
            if(estoque.get(produto).getPreco() > maisCaro){
                maisCaro = estoque.get(produto).getPreco();
                produtoMaisCaro = produto;
            }
        }
        return this.estoque.get(produtoMaisCaro);

}

    public Produto obterProdutoMaisBarato(){
        if(this.estoque.isEmpty())return null;
        
        double maisBarato = this.obterProdutoMaisCaro().getPreco();
        long produtoMaisBarato = 0;

        for(Long produto : this.estoque.keySet()){
            if(estoque.get(produto).getPreco() < maisBarato){
                maisBarato = estoque.get(produto).getPreco();
                produtoMaisBarato = produto;
            }
        }
        return this.estoque.get(produtoMaisBarato);

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        if(this.estoque.isEmpty())return null;
        
        double maiorQuantidade = 0;
        long produtoMaiorQuantidade = 0;

        for(Long produto : this.estoque.keySet()){
            double montanteProduto = ( estoque.get(produto).getQuantidade() * estoque.get(produto).getPreco() );
            if(montanteProduto > maiorQuantidade){
                maiorQuantidade = montanteProduto;
                produtoMaiorQuantidade = produto;
            }
        }
        return this.estoque.get(produtoMaiorQuantidade);
    }

}
