package br.pro.software;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeradorNumerosPrimosTest {

    GeradorNumerosPrimos gnp = new GeradorNumerosPrimos();

    @Test
    void primosAteDois() {
        Assertions.assertEquals("2", gnp.primosAte(2));
    }

    @Test
    void primosAteQuatro() {
        Assertions.assertEquals("2, 3", gnp.primosAte(4));
    }

    @Test
    void primosAteUm() {
        Assertions.assertThrows(PrimoAbaixoDoMinimoException.class, () -> gnp.primosAte(1));
    }

    @Test
    void primosAteMenosUm() {
        Assertions.assertThrows(PrimoAbaixoDoMinimoException.class, () -> gnp.primosAte(-1));
    }

    @Test
    void primosAteDez() {
        Assertions.assertEquals("2, 3, 5, 7", gnp.primosAte(10));
    }
}