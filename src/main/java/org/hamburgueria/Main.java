package org.hamburgueria;

public class Main {
    public static void main(String[] args) {

        Hamburguer pedido = new HamburguerBase();

        pedido = new Queijo(pedido);
        pedido = new Bacon(pedido);
        pedido = new Alface(pedido);

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());
    }
}