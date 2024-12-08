package com.hackathon.tictactoe.game;

import net.jorgedev.ConsoleClear;

public class TicTacToeGame {
    public static void exibirTabuleiro(char[][] tabuleiro) {
        // Limpa o console antes de exibir o tabuleiro
        ConsoleClear.run();

        System.out.println("Tabuleiro:");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Teste do método exibirTabuleiro
        char[][] tabuleiro = {
                {'X', ' ', 'O'},
                {' ', 'O', ' '},
                {'X', ' ', ' '}
        };
        exibirTabuleiro(tabuleiro);
    }
}