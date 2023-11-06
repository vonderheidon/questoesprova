package br.com.fescfafic.av3ex1.Model;

import br.com.fescfafic.av3ex1.Exception.ConfiguracaoInvalidaException;

public class LeitorDeConfiguracao {
    public LeitorDeConfiguracao() {}

    public void lerConfiguracao(Arquivo arquivo) {
        try {
            if (arquivo.getFormato().equals(".pdf")) {
                System.out.printf("Lendo o conteudo do arquivo %s.", arquivo.getFormato());
            } else {
                throw new ConfiguracaoInvalidaException();
            }
        } catch (ConfiguracaoInvalidaException e) {
            System.out.println(e);
        }
    }
}
