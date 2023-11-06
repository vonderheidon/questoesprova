package br.com.fescfafic.av5ex3.Main;

import br.com.fescfafic.av5ex3.Model.Registro;
import br.com.fescfafic.av5ex3.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Registro registro = new Registro();
        usuario.setPodeEditarRegistro(true);
        registro.alterarRegistro(usuario);
    }
}