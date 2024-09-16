package br.pro.software;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o último número para sequência de primos: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        GeradorNumerosPrimos gnp = new GeradorNumerosPrimos();
        System.out.println(gnp.primosAte(numero));
        scanner.close();
    }
}