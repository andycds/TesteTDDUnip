package br.pro.software;

public class PrimoAbaixoDoMinimoException extends RuntimeException {

    public PrimoAbaixoDoMinimoException(String maiorPrimo) {
        super("O menor primo é 2. O número pedido foi: " + maiorPrimo);
    }
}
