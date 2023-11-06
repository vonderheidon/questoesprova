package br.com.fescfafic.av2ex2.Model;

import br.com.fescfafic.av2ex2.Interface.INavegavel;

public class Submarino implements INavegavel {
    public Submarino() {}
    @Override
    public void navegar() {
        System.out.println("O submarino esta emergindo.");
    }
}
