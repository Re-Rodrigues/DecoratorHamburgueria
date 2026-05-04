package org.hamburgueria;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", Bacon";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 3.0;
    }
}