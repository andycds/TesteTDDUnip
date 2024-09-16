package br.pro.software;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeradorNumerosPrimos {
    public String primosAte(int numeroMaximo) {
        if (numeroMaximo < 2) {
            throw new PrimoAbaixoDoMinimoException("" + numeroMaximo);
        }
        Set<Integer> numerosNaoPrimos = new HashSet<>();
        return IntStream.rangeClosed(2, numeroMaximo)
                .filter(n -> {
                    if (numerosNaoPrimos.contains(n)) return false;
                    for (int multiplo = n * 2; multiplo <= numeroMaximo; multiplo += n) {
                        numerosNaoPrimos.add(multiplo);
                    }
                    return true;
                })
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
