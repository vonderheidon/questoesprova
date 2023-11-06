package br.com.fescfafic.av4ex2.Model;

import br.com.fescfafic.av4ex2.Interface.IMultimidia;

public class AudioPlayer implements IMultimidia {

    @Override
    public void play() {
        System.out.println("O audio esta sendo reproduzido.");
    }
    @Override
    public void pause() {
        System.out.println("O audio foi pausado.");
    }
    @Override
    public void stop() {
        System.out.println("O audio foi stopado.");
    }
}
