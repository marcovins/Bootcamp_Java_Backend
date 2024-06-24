package main.java.set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;
    
    ConjuntoConvidados(){
        this.convidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(Convidado convidado){
        this.convidados.add(convidado);
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado convidado = new Convidado(nome, codigoConvite);
        this.convidados.add(convidado);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado convidado : this.convidados){
            if(convidado.getCodigoConvite() == codigoConvite){
                this.convidados.remove(convidado);
                break; 
            }
        }
    }

    public int contarConvidados() {
        return this.convidados.size();
    }

    public void exibirConvidados(){
        for(Convidado convidado : this.convidados){
            System.out.println(convidado.toString());
            System.out.println();
        }
    }
}
