package br.com.zup;

import java.util.Scanner;

public class Lista06Ex02 {
    public static void main(String[] args) {
        // 2 - Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
        Scanner leitor = new Scanner(System.in);

        int numeroDia;
        System.out.println("Digite um número de 1 a 7 e veja o dia da semana correspondente:");
        numeroDia = leitor.nextInt();
        switch (numeroDia) {
            case 1:
                System.out.println("Número 1 corresponde ao dia da semana Domingo");
                break;
            case 2:
                System.out.println("Número 2 corresponde ao dia da semana Segunda-Feira");
                break;
            case 3:
                System.out.println("Número 3 corresponde ao dia da semana Terça-feira");
                break;
            case 4:
                System.out.println("Número 4 corresponde ao dia da semana Quarta-feira");
                break;
            case 5:
                System.out.println("Número 5 corresponde ao dia da semana Quinta-feira");
                break;
            case 6:
                System.out.println("Número 6 corresponde ao dia da semana Sexta-feira");
                break;
            case 7:
                System.out.println("Número 7 corresponde ao dia da semana Sábado");
                break;
            default:
                System.out.println("O dia da semana está incorreto.");
                break;
        }
    }
}
