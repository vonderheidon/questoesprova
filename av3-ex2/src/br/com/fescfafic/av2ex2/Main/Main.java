package br.com.fescfafic.av2ex2.Main;

import br.com.fescfafic.av2ex2.Model.Smartphone;
import br.com.fescfafic.av2ex2.Model.VeiculoEletrico;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(50);
        VeiculoEletrico veiculoEletrico = new VeiculoEletrico(70);
        smartphone.verificarBateria();
        smartphone.recarregar(5);
        smartphone.verificarBateria();
    }
}