package org.hamburgueria;

public class HamburguerBase implements Hamburguer {

    @Override
    public String getDescricao() {
        return "Pão + Carne";
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}