package br.com.fescfafic.av2ex2.Model;

import br.com.fescfafic.av2ex2.Interface.IRecarregavel;

public class Smartphone implements IRecarregavel {
    public int nivelDaBateria;

    public Smartphone(int nivelDaBateria) {
        this.nivelDaBateria = nivelDaBateria;
    }

    @Override
    public void recarregar(int carga) {
        if (this.nivelDaBateria + carga > 100) {
            this.nivelDaBateria = 100;
        } else {
            this.nivelDaBateria += carga;
        }
    }
    @Override
    public void verificarBateria() {
        System.out.printf("Nivel da bateria: %d%%\n", this.nivelDaBateria);
    }
}
