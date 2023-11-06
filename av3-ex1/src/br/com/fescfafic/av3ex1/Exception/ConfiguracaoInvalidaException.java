package br.com.fescfafic.av3ex1.Exception;

public class ConfiguracaoInvalidaException extends RuntimeException {
    public ConfiguracaoInvalidaException() {
        super("O formato do arquivo e invalido.");
    }
}
