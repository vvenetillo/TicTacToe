package com.hackathon.tictactoe.game;

import java.util.Arrays;
import java.util.Scanner;

public class Board {

    private static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = {'X', 'O'};

    public static char[][] inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            Arrays.fill(tabuleiro[i], ' ');
        }
        return tabuleiro;
    }


    public static char obterCaractereUsuario() {
        Scanner scanner = new Scanner(System.in);
        char caractereEscolhido;

        while (true) {
            // Exibindo os caracteres aceitos de forma clara
            System.out.print("Escolha um caractere para representar você no jogo (");
            for (int i = 0; i < CARACTERES_IDENTIFICADORES_ACEITOS.length; i++) {
                if (i > 0) {
                    System.out.print(" ou ");
                }
                System.out.print(CARACTERES_IDENTIFICADORES_ACEITOS[i]);
            }
            System.out.println("): ");
            System.out.print("Digite seu caractere: ");

            caractereEscolhido = scanner.next().charAt(0);

            boolean valido = false;
            for (char c : CARACTERES_IDENTIFICADORES_ACEITOS) {
                if (c == caractereEscolhido) {
                    valido = true;
                    break;
                }
            }

            if (valido) {
                break;
            } else {
                System.out.println("Caractere inválido! Por favor, escolha um caractere válido.");
            }
        }

        return caractereEscolhido;
    }

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];

        inicializarTabuleiro(tabuleiro);

        char caractereUsuario = obterCaractereUsuario();

        System.out.println("Tabuleiro inicializado:");
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                System.out.print("[" + celula + "]");
            }
            System.out.println();
        }
        System.out.println("Você escolheu o caractere: " + caractereUsuario);
    }
}