package br.com.fescfafic.av3ex3.Model;

import br.com.fescfafic.av3ex3.Exception.TransacaoNegadaException;

public class Banco {
    public Banco() {}

    public void executarTransacao(Usuario usuario) {
        try {
            if (usuario.getTempermissaoParaTransacao()) {
                System.out.println("Transacao efetuada.");
            } else {
                throw new TransacaoNegadaException();
            }
        } catch (TransacaoNegadaException e) {
            System.out.println(e);
        }
    }
}
