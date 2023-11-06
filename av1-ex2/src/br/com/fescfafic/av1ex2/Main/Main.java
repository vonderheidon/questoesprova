package br.com.fescfafic.av1ex2.Main;

import br.com.fescfafic.av1ex2.Model.Divisao;
import br.com.fescfafic.av1ex2.Model.Multiplicacao;
import br.com.fescfafic.av1ex2.Model.Soma;
import br.com.fescfafic.av1ex2.Model.Subtracao;

public class Main {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();

        divisao.calcular(6,6);
        multiplicacao.calcular(6,6);
        soma.calcular(6,6);
        subtracao.calcular(6,6);
    }
}