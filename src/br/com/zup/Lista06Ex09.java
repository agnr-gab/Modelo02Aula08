package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista06Ex09 {
    public static void main(String[] args) {
        // 9 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa.
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int contador = 1;
        int contadorDeExibicao = 9;
        int finalDeExibicao = 0;
        int totalDeNumeros = 10;
        int valorDigitadoPeloUsuario = 0;

        while (contador <= totalDeNumeros) {
            System.out.println("Digite o " + contador + "º número:");
            valorDigitadoPeloUsuario = leitor.nextInt();
            numeros.add(valorDigitadoPeloUsuario);
            contador++;
        }
        while (contadorDeExibicao >= finalDeExibicao) {
            System.out.println(numeros.get(contadorDeExibicao));
            contadorDeExibicao --;
        }
    }
}
