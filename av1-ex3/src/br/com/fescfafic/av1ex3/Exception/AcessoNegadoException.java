package br.com.fescfafic.av1ex3.Exception;

public class AcessoNegadoException extends RuntimeException {
    public AcessoNegadoException() {
        super("Acesso negado.");
    }
}
