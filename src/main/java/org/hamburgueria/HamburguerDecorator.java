package org.hamburgueria;

public abstract class HamburguerDecorator implements Hamburguer {
    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }
}