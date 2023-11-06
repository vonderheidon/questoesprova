package br.com.fescfafic.av2ex2.Model;

import br.com.fescfafic.av2ex2.Interface.INavegavel;

public class Barco implements INavegavel {
    public Barco() {}
    @Override
    public void navegar() {
        System.out.println("O barco esta navegando.");
    }
}
