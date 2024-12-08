package com.hackathon.tictactoe.game;

import java.util.Scanner;

public class Player {

    private static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O'};

    public static char obterCaractereUsuario(Scanner teclado, char caractereUsuario) {
        char caractereComputador;

        while (true) {
            System.out.print("Escolha um caractere para o computador (");
            for (int i = 0; i < CARACTERES_IDENTIFICADORES_ACEITOS.length; i++) {
                if (i > 0) {
                    System.out.print(" ou ");
                }
                System.out.print(CARACTERES_IDENTIFICADORES_ACEITOS[i]);
            }
            System.out.println("): ");
            System.out.print("Digite o caractere para o computador: ");

            caractereComputador = teclado.next().charAt(0);

            boolean valido = false;
            for (char c : CARACTERES_IDENTIFICADORES_ACEITOS) {
                if (c == caractereComputador && c != caractereUsuario) {
                    valido = true;
                    break;
                }
            }

            if (valido) {
                break;
            } else {
                System.out.println("Caractere inválido ou já escolhido pelo usuário! Tente novamente.");
            }
        }

        return caractereComputador;
    }

    public static boolean obterCaractereComputador(String posicoesLivres, int linha, int coluna) {
        // Cria a representação da posição jogada
        String jogada = linha + "," + coluna;

        return posicoesLivres.contains(jogada);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caractere escolhido pelo usuário (X ou O): ");
        char caractereUsuario = scanner.next().charAt(0);
        char caractereComputador = obterCaractereUsuario(scanner, caractereUsuario);

        System.out.println("Usuário escolheu: " + caractereUsuario);
        System.out.println("Computador escolheu: " + caractereComputador);
        String posicoesLivres = "0,0;0,1;1,1;2,2";
        System.out.println("Validação de jogada:");
        System.out.println("Jogada (1,1) válida? " + obterCaractereComputador(posicoesLivres, 1, 1)); // true
        System.out.println("Jogada (2,0) válida? " + obterCaractereComputador(posicoesLivres, 2, 0)); // false
    }
}
