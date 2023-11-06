package br.com.fescfafic.av1ex3.Model;

import br.com.fescfafic.av1ex3.Exception.AcessoNegadoException;

public class Acesso {
    public Acesso() {}

    public void verificarAcesso(Usuario usuario) {
        try {
            if (usuario.getNivelDeAcesso() < 5) {
                throw new AcessoNegadoException();
            }
            System.out.println("Acesso concedido.");
        } catch (AcessoNegadoException e) {
            System.err.println(e);
        }
    }
}
