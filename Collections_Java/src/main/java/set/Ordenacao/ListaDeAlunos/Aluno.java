package main.java.set.Ordenacao.ListaDeAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private long matricula;
    private double nota;
    
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareTo(a.nome);
    }
    
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }

}
