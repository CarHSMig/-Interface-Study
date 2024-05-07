package br.unipar.teste;

import br.unipar.interfaces.interfaceAnimais;

public class Cachorro implements interfaceAnimais {

    @Override
    public String emitirSom() {
        return "Auauau";
    }

    @Override
    public void correr() {
        Integer velocidade = 10;

    }

    @Override
    public void alimentacao() {
    }
}

