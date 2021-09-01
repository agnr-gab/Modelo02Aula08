package br.com.zup;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lista06Ex03 {
    public static void main(String[] args) {

    /* LISTA DE EXERCÍCIOS - REVISÃO MÓDULO 2
    3 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:*/
        Scanner leitorTabuada = new Scanner(System.in);

        int numeroTabuada; //entrada do usuario
        System.out.println("Para verificar a tabuada digite um número entre 1 e 10:");
        numeroTabuada = leitorTabuada.nextInt();
        if (numeroTabuada <= 0 || numeroTabuada > 10) {
            System.out.println("Insira um número válido entre 1 e 10");
            numeroTabuada = leitorTabuada.nextInt();
        }
        System.out.println("Tabuada do nº" + numeroTabuada + ":");
        for (int N = 1; N <= 10; N++) {
            System.out.println(numeroTabuada + " x " + N + " = " + numeroTabuada * N);
        }
    }
}

