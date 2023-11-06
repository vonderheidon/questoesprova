package br.com.fescfafic.av3ex3.Exception;

public class TransacaoNegadaException extends RuntimeException {
    public TransacaoNegadaException() {
        super("A transacao foi negada.");
    }
}
