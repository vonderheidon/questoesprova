package br.com.fescfafic.av3ex1.Main;

import br.com.fescfafic.av3ex1.Model.Arquivo;
import br.com.fescfafic.av3ex1.Model.LeitorDeConfiguracao;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        arquivo.setFormato(".docx");
        LeitorDeConfiguracao leitorDeConfiguracao = new LeitorDeConfiguracao();
        leitorDeConfiguracao.lerConfiguracao(arquivo);
    }
}