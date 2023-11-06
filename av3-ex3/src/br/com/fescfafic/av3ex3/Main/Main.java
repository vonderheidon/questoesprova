package br.com.fescfafic.av3ex3.Main;

import br.com.fescfafic.av3ex3.Model.Banco;
import br.com.fescfafic.av3ex3.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Banco banco = new Banco();
        usuario.setTemPErmissaoParaTransacao(false);
        banco.executarTransacao(usuario);
    }
}