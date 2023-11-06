package br.com.fescfafic.av4ex2.Model;

import br.com.fescfafic.av4ex2.Interface.IMultimidia;

public class VideoPlayer implements IMultimidia {
    @Override
    public void play() {
        System.out.println("O video esta sendo reproduzido.");
    }
    @Override
    public void pause() {
        System.out.println("O video foi pausado.");
    }
    @Override
    public void stop() {
        System.out.println("O video foi stopado.");
    }
}
