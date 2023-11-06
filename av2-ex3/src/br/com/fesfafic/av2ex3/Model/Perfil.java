package br.com.fesfafic.av2ex3.Model;

public class Perfil {
    public Perfil() {}

    public void editarPerfil(Usuario usuario) {
        if (usuario.podeEditar) {
            System.out.println("Editando perfil.");
        } else {
            System.out.println("Esse usuario nao pode ser editado.");
        }
    }
}
