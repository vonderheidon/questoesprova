package br.com.fescfafic.av5ex2.Model;

import br.com.fescfafic.av5ex2.Interface.IMovel;

public class Carro implements IMovel {
    @Override
    public void mover() {
        System.out.println("O carro esta acelerando.");
    }
}
