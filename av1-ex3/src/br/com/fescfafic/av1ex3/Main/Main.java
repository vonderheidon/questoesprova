package br.com.fescfafic.av1ex3.Main;

import br.com.fescfafic.av1ex3.Model.Acesso;
import br.com.fescfafic.av1ex3.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Acesso acesso = new Acesso();
        Usuario usuario = new Usuario();
        usuario.setNivelDeAcesso(5);
        acesso.verificarAcesso(usuario);
    }
}