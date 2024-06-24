package main.java.map.Ordenacao.LivrariaOnline;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    LivrariaOnline() {
        this.livraria = new HashMap<String, Livro>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        this.livraria.put(link, livro);
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                this.livraria.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        TreeMap<String, Livro> livrariaOrdenada = new TreeMap<>(Comparator.comparing(livraria::get));
        livrariaOrdenada.putAll(livraria);

        for (Map.Entry<String, Livro> entry : livrariaOrdenada.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
