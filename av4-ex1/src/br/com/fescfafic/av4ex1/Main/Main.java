package br.com.fescfafic.av4ex1.Main;

import br.com.fescfafic.av4ex1.Model.Carregador;
import br.com.fescfafic.av4ex1.Model.Imagem;

public class Main {
    public static void main(String[] args) {
        Imagem imagem = new Imagem();
        imagem.setNome("teste.jpg");
        Carregador carregador = new Carregador();
        carregador.carregarImagem(imagem);
    }
}