package com.hackathon.tictactoe.game;

public class TicTacToeGame {
    public static char[][] inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
        return tabuleiro;
    }

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];

        inicializarTabuleiro(tabuleiro);

        System.out.println("Tabuleiro inicializado:");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }

            System.out.println();
        }
    }
}