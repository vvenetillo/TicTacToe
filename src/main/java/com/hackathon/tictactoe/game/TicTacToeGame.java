package com.hackathon.tictactoe.game;

import java.util.Scanner;

public class TicTacToeGame {

    private static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O'};

    public static char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
        char caractereComputador;

        while (true) { // Loop para garantir entrada válida
            System.out.print("Escolha o caractere para o computador (X ou O): ");
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
                System.out.println("Caractere inválido ou já escolhido pelo usuário! Por favor, tente novamente.");
            }
        }

        return caractereComputador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o caractere do usuário (X ou O): ");

        char caractereUsuario = scanner.next().charAt(0);
        char caractereComputador = obterCaractereComputador(scanner, caractereUsuario);
        
        System.out.println("Usuário escolheu o caractere: " + caractereUsuario);
        System.out.println("Computador escolheu o caractere: " + caractereComputador);
    }
}
