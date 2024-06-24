package main.java.list.Ordenacao.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {

    private List<Pessoa> pessoa_list;

    OrdenacaoPessoa(){
        this.pessoa_list = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoa_list.add(new Pessoa(nome, idade, altura));
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoa_list.add(pessoa);
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(this.pessoa_list);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(this.pessoa_list);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }    
}
