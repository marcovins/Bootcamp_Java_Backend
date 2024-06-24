package main.java.set.Ordenacao.CadastroDeProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    Produto(long cod, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return this.nome.compareToIgnoreCase(p.getNome());


    }
    
    @Override
    public String toString() {
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", cod='" + cod + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            '}';
    }


}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

    
}
