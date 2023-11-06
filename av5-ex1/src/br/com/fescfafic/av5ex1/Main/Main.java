package br.com.fescfafic.av5ex1.Main;

import br.com.fescfafic.av5ex1.Model.Computador;
import br.com.fescfafic.av5ex1.Model.Dispositivo;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();
        Computador computador = new Computador();
        //dispositivo.setoCaboEstaConectado(true);
        computador.conectarDispositivo(dispositivo);
    }
}