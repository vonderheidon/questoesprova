package br.com.fescfafic.av1ex2.Model;

import br.com.fescfafic.av1ex2.Interface.IOperacaoMatematica;

public class Divisao implements IOperacaoMatematica {
    public Divisao(){}
    @Override
    public void calcular(double a, double b) {
        System.out.println(a/b);
    }
}
