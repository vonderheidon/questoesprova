package br.com.fescfafic.av5ex3.Model;

public class Usuario {
    private boolean podeEditarRegistro;

    public Usuario() {}

    public void setPodeEditarRegistro(boolean podeEditarRegistro) {
        this.podeEditarRegistro = podeEditarRegistro;
    }
    public boolean getPodeEditarRegistro() {
        return this.podeEditarRegistro;
    }
}
