package br.com.fesfafic.av2ex3.Main;

import br.com.fesfafic.av2ex3.Model.Perfil;
import br.com.fesfafic.av2ex3.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(true);
        Usuario usuario2 = new Usuario(false);
        Perfil perfil = new Perfil();
        perfil.editarPerfil(usuario1);
        perfil.editarPerfil(usuario2);
    }
}