package br.com.zup;

import java.util.Scanner;

public class Lista06Ex05 {
    public static void main(String[] args) {
        // 5 - Faça um programa que leia 5 números e informe o maior número.
        Scanner leitorMaior = new Scanner(System.in);

        int entradaNumero; // entrada do usuário
        int maiorNumero = 0;
        int contador = 1;
        int qtdNumeros = 5;

        while (contador <= qtdNumeros) {
            System.out.println("Digite o " + contador + " numero:");
            entradaNumero = leitorMaior.nextInt();
        if (entradaNumero > maiorNumero)
            maiorNumero = entradaNumero;
            contador++;
        }
        System.out.println("O maior número digitado é " +maiorNumero+ ".");
    }
}
