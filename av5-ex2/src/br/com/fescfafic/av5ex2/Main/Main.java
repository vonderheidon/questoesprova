package br.com.fescfafic.av5ex2.Main;

import br.com.fescfafic.av5ex2.Model.Bicicleta;
import br.com.fescfafic.av5ex2.Model.Carro;
import br.com.fescfafic.av5ex2.Model.Skate;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();
        Skate skate = new Skate();
        bicicleta.mover();
        carro.mover();
        skate.mover();
    }
}