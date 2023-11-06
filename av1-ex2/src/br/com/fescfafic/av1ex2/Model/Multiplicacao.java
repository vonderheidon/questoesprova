package br.com.fescfafic.av1ex2.Model;

import br.com.fescfafic.av1ex2.Interface.IOperacaoMatematica;

public class Multiplicacao implements IOperacaoMatematica {
    public Multiplicacao(){}
    @Override
    public void calcular(double a, double b) {
        System.out.println(a*b);
    }
}
