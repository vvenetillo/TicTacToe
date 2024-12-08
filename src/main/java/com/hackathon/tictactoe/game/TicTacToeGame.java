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
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                System.out.print("[" + celula + "]");
            }
            System.out.println();
        }
    }
}
