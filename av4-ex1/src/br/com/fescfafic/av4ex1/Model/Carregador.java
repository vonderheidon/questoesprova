package br.com.fescfafic.av4ex1.Model;

import br.com.fescfafic.av4ex1.Exception.ImagemNaoEncontradaException;

public class Carregador {
    public Carregador() {}

    public void carregarImagem(Imagem imagem) {
        try {
            if (imagem.getNome() == null) {
                throw new ImagemNaoEncontradaException();
            } else {
                System.out.println("Imagem carregada com sucesso.");
            }
        } catch (ImagemNaoEncontradaException e) {
            System.out.println(e);
        }
    }
}
