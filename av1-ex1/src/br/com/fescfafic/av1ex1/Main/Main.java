package br.com.fescfafic.av1ex1.Main;

import br.com.fescfafic.av1ex1.Model.Arquivo;
import br.com.fescfafic.av1ex1.Model.LeitorDeArquivo;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo();
        Arquivo arquivo2 = new Arquivo();
        Arquivo arquivo3 = new Arquivo();

        arquivo1.setNome("dados1.txt");
        arquivo2.setNome("dados2.txt");
        arquivo1.setConteudo("Eu só acordo mais cedo para poder me atrasar com calma.");

        LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();

        System.out.println("Abrindo arquivo que existe e tem conteudo:");
        leitorDeArquivo.abrirArquivo(arquivo1);

        System.out.println("\nAbrindo arquivo que existe mas nao tem conteudo:");
        leitorDeArquivo.abrirArquivo(arquivo2);

        System.out.println("\nAbrindo arquivo que nao existe:");
        leitorDeArquivo.abrirArquivo(arquivo3);
    }
}