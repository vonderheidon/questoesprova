package br.com.fescfafic.av1ex1.Exception;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException() {
        super("Esse arquivo nao existe.");
    }
}
