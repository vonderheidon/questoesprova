package br.com.fescfafic.av2ex2.Main;

import br.com.fescfafic.av2ex2.Model.Barco;
import br.com.fescfafic.av2ex2.Model.Submarino;
import br.com.fescfafic.av2ex2.Model.Surfista;

public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();
        Submarino submarino = new Submarino();
        Surfista surfista = new Surfista();

        barco.navegar();
        submarino.navegar();
        surfista.navegar();
    }
}