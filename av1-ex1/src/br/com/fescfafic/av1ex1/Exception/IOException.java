package br.com.fescfafic.av1ex1.Exception;

public class IOException extends RuntimeException {
    public IOException() {
        super("O arquivo esta em branco.");
    }
}
