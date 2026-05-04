package org.hamburgueria;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", Queijo";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 2.0;
    }
}