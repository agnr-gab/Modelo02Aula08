package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista06Ex08 {
    public static void main(String[] args) {
        //LISTA DE EXERCÍCIOS - REVISÃO MÓDULO 2 ==> 8 - Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.

        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int contador = 1;
        int totalDeNumeros = 5;
        int valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros) {
            System.out.println("Por favor, digite o " + contador + "° número:");
            valorDigitadoPeloUsuario = leitor.nextInt();

            // Verificando se o valor é maior do que 0
            if (valorDigitadoPeloUsuario >= 0) {
                // Adicionando valor na lista
                numeros.add(valorDigitadoPeloUsuario);
                contador++;
            } else {
                System.out.println("Valor inválido");
            }
        }
        System.out.println(numeros);
    }
}
