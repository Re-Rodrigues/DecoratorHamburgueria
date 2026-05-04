package org.hamburgueria;

public class Alface extends HamburguerDecorator {

    public Alface(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + ", Alface";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 1.5;
    }
}