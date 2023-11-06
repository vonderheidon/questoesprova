package br.com.fescfafic.av4ex3.Model;


public class GerenciadorDeUsuarios {
    public GerenciadorDeUsuarios() {}

    public void adicionarUsuario(Usuario usuario) {
        if (usuario.getAdmin()) {
            System.out.println("O usuario foi adicionado ao sistema.");
        } else {
            System.out.println("O usuario nao tem permissao.");
        }
    }
}
