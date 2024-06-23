package org;

import org.Implementacao.Iphone;

public class main {

    public static void main(String[] args) {
        
        Iphone iphone_12 = new Iphone();

        //Funções do Reprodutor Musical
        System.out.println("REPRODUTOR MUSICAL:");
        iphone_12.selecionarMusica("In flames - Stay with me");
        iphone_12.tocar();
        iphone_12.pausar();
        System.out.println("");
        
        //Funções do Aparelho Telefonico
        System.out.println("Aparelho Telefonico:");
        iphone_12.ligar("7845269885");
        iphone_12.atender();
        iphone_12.iniciarCorreioVoz();
        System.out.println("");

        //Funções do Navegador na Internet
        System.out.println("Navegador na Internet:");
        iphone_12.exibirPagina("www.google.com.br");
        iphone_12.atualizarPagina();
        iphone_12.adicionarNovaAba();
        System.out.println("");

    }

}
