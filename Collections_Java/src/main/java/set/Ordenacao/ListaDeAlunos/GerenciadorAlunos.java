package main.java.set.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        Aluno aluno = new Aluno(nome, matricula, nota);
        this.alunos.add(aluno);
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula() == matricula) {
                this.alunos.remove(aluno);
                break;
            }
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<Aluno>(this.alunos);
        this.exibirAlunos(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<Aluno>(new ComparatorPorNota());
        alunosPorNota.addAll(this.alunos);
        this.exibirAlunos(alunosPorNota);
    }

    public void exibirAlunos(Set<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }

    }

    public void exibirAlunos() {
        for (Aluno aluno : this.alunos) {
            System.out.println(aluno.toString());
        }

    }

}
