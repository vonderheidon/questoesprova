package br.com.fescfafic.av2ex1.Model;

import br.com.fescfafic.av2ex1.Exception.DatabaseException;

public class BancoDeDados {
    private String senha = "admin";
    private String usuario = "admin";

    public BancoDeDados() {}

    public void conectarBancoDeDados(String usuario, String senha) {
        try {
            if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
                System.out.println("Conectado.");
            } else {
                throw new DatabaseException();
            }
        } catch (DatabaseException e) {
            System.err.println(e);
        }
    }
}
