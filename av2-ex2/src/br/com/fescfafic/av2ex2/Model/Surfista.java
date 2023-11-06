package br.com.fescfafic.av2ex2.Model;

import br.com.fescfafic.av2ex2.Interface.INavegavel;

public class Surfista implements INavegavel {
    public Surfista() {}
    @Override
    public void navegar() {
        System.out.println("O surfista esta pegando uma onda maneira.");
    }
}
