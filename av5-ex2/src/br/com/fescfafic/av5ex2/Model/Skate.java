package br.com.fescfafic.av5ex2.Model;

import br.com.fescfafic.av5ex2.Interface.IMovel;

public class Skate implements IMovel {
    @Override
    public void mover() {
        System.out.println("O skatista esta fazendo andando de skate.");
    }
}
