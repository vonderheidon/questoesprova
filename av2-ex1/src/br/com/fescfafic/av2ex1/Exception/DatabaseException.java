package br.com.fescfafic.av2ex1.Exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException() {
        super("Erro ao conectar ao banco de dados.");
    }
}
