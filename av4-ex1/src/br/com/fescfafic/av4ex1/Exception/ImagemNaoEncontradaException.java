package br.com.fescfafic.av4ex1.Exception;

public class ImagemNaoEncontradaException extends RuntimeException {
    public ImagemNaoEncontradaException() {
        super("A imagem nao foi encontrada");
    }
}
