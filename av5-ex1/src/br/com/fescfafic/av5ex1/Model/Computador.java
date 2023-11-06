package br.com.fescfafic.av5ex1.Model;

import br.com.fescfafic.av5ex1.Exception.DispositivoNaoConectadoException;

public class Computador {
    public Computador() {}

    public void conectarDispositivo(Dispositivo dispositivo) {
        try {
            if (dispositivo.getOCaboEstaConectado()) {
                System.out.println("O dispositivo foi conectado.");
            } else {
                throw new DispositivoNaoConectadoException();
            }
        } catch (DispositivoNaoConectadoException e) {
            System.err.println(e);
        }
    }
}
