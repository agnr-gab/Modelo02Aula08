package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LevelUp {
    public static void main(String[] args) {
        // Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome, telefone e email. No final do programa deve ser exibido a lista de alunos cadastrados.
        /* Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em uma lista e retornar o mesmo na tela.
Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um menu para decidir se deverá adicionar mais alunos ou encerrar o programa.
Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o email e não permite inserir um aluno com o email repetido.*/

        Map<String, String> alunosMatricula = new HashMap<>();

        Scanner leitorMatricula = new Scanner(System.in);
        //loop infinito
        while (true) {

            System.out.println("Digite 1 para adicionar aluno.");
            System.out.println("Digite 2 remover aluno.");
            System.out.println("Digite 3 para encerrar programa.");
            int opcaoEscolhida = leitorMatricula.nextInt();
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Digite o nome do aluno");
                    String nomeAluno = leitorMatricula.next();
                    System.out.println("Digite o telefone do aluno");
                    String telefoneAluno = leitorMatricula.next();
                    System.out.println("Digite o e-mail do aluno");
                    String emailAluno = leitorMatricula.next();
                    alunosMatricula.put(emailAluno, nomeAluno);
                    alunosMatricula.put(emailAluno, telefoneAluno);
                    for (String aluno : alunosMatricula.keySet()) {
                        System.out.println("Chave: " + aluno + " valor: " + alunosMatricula.get(aluno));
                    }
                    //System.out.println(alunosMatricula.containsValue(emailAluno));
                    break;
                case 2:
                    System.out.println("Digite o email do aluno");
                    emailAluno = leitorMatricula.next();
                    alunosMatricula.remove(emailAluno);
                    break;

            } if (opcaoEscolhida == 3) {
                break;
            }
        }
    }
}
