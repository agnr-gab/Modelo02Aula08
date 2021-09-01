package br.com.zup;

import java.util.Scanner;

public class Lista06Ex01 {
    public static void main(String[] args) {
        /* LISTA DE EXERCÍCIOS - REVISÃO MÓDULO 2
        1 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

        Scanner leitorPreco = new Scanner(System.in);
        //variaveis
        double produto = 0; //valor inserido pelo usuário

        for (int contador = 1; contador <= 3; contador++) {
            System.out.println("Digite o valor do " + contador + "º produto:");
            produto = leitorPreco.nextDouble();
        }
        if (produto < produto)
        System.out.println("o menor preço é" + produto);
    }
}
