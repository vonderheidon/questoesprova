package br.com.fescfafic.av5ex3.Model;

public class Registro {
    public Registro() {}

    public void alterarRegistro(Usuario usuario) {
        if (usuario.getPodeEditarRegistro()) {
            System.out.println("Alterando registro do usuario.");
        } else {
            System.out.println("Esse usuario nao tem permissao para alterar registro.");
        }
    }
}
