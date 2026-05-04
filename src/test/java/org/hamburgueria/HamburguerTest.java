package org.hamburgueria;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

public class HamburguerTest {

    @Test
     void deveRetornarHamburguerBase() {
        Hamburguer hamburguer = new HamburguerBase();

        assertEquals("Pão + Carne", hamburguer.getDescricao());
        assertEquals(10.0, hamburguer.getPreco());
    }

    @Test
    void deveAdicionarQueijo() {
        Hamburguer hamburguer = new HamburguerBase();
        hamburguer = new Queijo(hamburguer);

        assertEquals("Pão + Carne, Queijo", hamburguer.getDescricao());
        assertEquals(12.0, hamburguer.getPreco());
    }

    @Test
    void deveAdicionarBacon() {
        Hamburguer hamburguer = new HamburguerBase();
        hamburguer = new Bacon(hamburguer);

        assertEquals("Pão + Carne, Bacon", hamburguer.getDescricao());
        assertEquals(13.0, hamburguer.getPreco());
    }

    @Test
    void deveAdicionarAlface() {
        Hamburguer hamburguer = new HamburguerBase();
        hamburguer = new Alface(hamburguer);

        assertEquals("Pão + Carne, Alface", hamburguer.getDescricao());
        assertEquals(11.5, hamburguer.getPreco());
    }

    @Test
    void deveAdicionarMultiplosIngredientes() {
        Hamburguer hamburguer = new HamburguerBase();
        hamburguer = new Queijo(hamburguer);
        hamburguer = new Bacon(hamburguer);
        hamburguer = new Alface(hamburguer);

        assertEquals("Pão + Carne, Queijo, Bacon, Alface", hamburguer.getDescricao());
        assertEquals(16.5, hamburguer.getPreco());
    }
}