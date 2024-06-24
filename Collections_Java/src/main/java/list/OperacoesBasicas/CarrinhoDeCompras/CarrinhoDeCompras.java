package main.java.list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> lista_itens;
    
    CarrinhoDeCompras(){
        this.lista_itens = new ArrayList<Item>();
    }

    public void adicionarItem(Item item) {
        this.lista_itens.add(item);
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.lista_itens.add(item);
    }

    public void removerItem(String nome) {
        this.lista_itens.removeIf(item -> item.getNome().equals(nome));
    }

    public void removerItem(Item item) {
        this.lista_itens.remove(item);
    }

    public double calcularValorTotal(){
        double total = 0; 
        for(Item item : lista_itens){
            total += (item.getPreco() * item.getQuantidade()); 
        }
        return total;
    }

    public void exibirItens(){
        for(Item item : this.lista_itens){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println(); 
        }
    }
}
