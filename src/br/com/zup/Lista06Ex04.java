package br.com.zup;

import java.util.Scanner;

public class Lista06Ex04 {
    public static void main(String[] args) {
        /* LISTA DE EXERCÍCIOS - REVISÃO MÓDULO 2
        4 - Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.   */
        Scanner leitorNPrimo = new Scanner(System.in);

        int qtdNumero; //entrada do usuário
        int qtdDividores = 0;

        System.out.println("Insira um número inteiro e será verificado se ele é um nº primo:");
        qtdNumero = leitorNPrimo.nextInt();

        for (int i = 1; i <= qtdNumero; i++) {
            if (qtdNumero % i == 0) {
                qtdDividores++;
            }
        }
        if (qtdDividores == 2) {
            System.out.println("O " + qtdNumero + " é um número primo.");
        } else {
            System.out.println("O " + qtdNumero + " NÃO é um número primo.");
        }
    }
}
