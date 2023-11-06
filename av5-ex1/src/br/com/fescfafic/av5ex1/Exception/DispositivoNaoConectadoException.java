package br.com.fescfafic.av5ex1.Exception;

public class DispositivoNaoConectadoException extends RuntimeException {
    public DispositivoNaoConectadoException() {
        super("O dispositivo nao foi conectado.");
    }
}
