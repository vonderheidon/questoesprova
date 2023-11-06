package br.com.fescfafic.av4ex3.Main;

import br.com.fescfafic.av4ex3.Model.GerenciadorDeUsuarios;
import br.com.fescfafic.av4ex3.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeUsuarios gerenciadorDeUsuarios = new GerenciadorDeUsuarios();
        Usuario usuario = new Usuario();
        usuario.setAdmin(true);
        gerenciadorDeUsuarios.adicionarUsuario(usuario);
    }
}