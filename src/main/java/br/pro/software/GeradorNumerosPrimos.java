package br.pro.software;

import java.util.ArrayList;
import java.util.List;

public class GeradorNumerosPrimos {
    public String primosAte(int numeroMaximo) {
        if (numeroMaximo < 2) {
            throw new PrimoAbaixoDoMinimoException("" + numeroMaximo);
        }
        List<Integer> numerosPrimos = new ArrayList<>();
        for (int i = 2; i <= numeroMaximo; i++) {
            numerosPrimos.add(i);
        }
        numerosPrimos.forEach( n -> {
            for (int multiplo = n * 2; multiplo <= numeroMaximo; multiplo += n) {
                numerosPrimos.remove(Integer.valueOf(multiplo));
            }
        });
        return String.join(", ", numerosPrimos.stream().map(Object::toString).toList());
    }
}
