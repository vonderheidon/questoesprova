package br.com.fescfafic.av1ex1.Model;

import br.com.fescfafic.av1ex1.Exception.FileNotFoundException;
import br.com.fescfafic.av1ex1.Exception.IOException;

public class LeitorDeArquivo {
    public LeitorDeArquivo() {}

    public void abrirArquivo(Arquivo arquivo) {
        boolean aberto = false;
        try {
            if (arquivo.getNome() == null) {
                throw new FileNotFoundException();
            } else {
                System.out.printf("O arquivo %s foi aberto.\n", arquivo.getNome());
                lerArquivo(arquivo);
                aberto = true;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            aberto = false;
        }
    }
    private void lerArquivo(Arquivo arquivo) {
        try {
            if (arquivo.conteudo != null) {
                System.out.println("Conteudo do arquivo:");
                System.out.println(arquivo.getConteudo());
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
