package br.com.fescfafic.av2ex1.Main;

import br.com.fescfafic.av2ex1.Model.BancoDeDados;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.conectarBancoDeDados("admin", "admin");
    }
}