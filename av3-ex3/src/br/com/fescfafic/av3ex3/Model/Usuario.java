package br.com.fescfafic.av3ex3.Model;

public class Usuario {
    protected boolean temPermissaoParaTransacao;

    public Usuario() {}

    public void setTemPErmissaoParaTransacao(boolean temPErmissaoParaTransacao) {
        this.temPermissaoParaTransacao = temPErmissaoParaTransacao;
    }
    public boolean getTempermissaoParaTransacao() {
        return this.temPermissaoParaTransacao;
    }
}
