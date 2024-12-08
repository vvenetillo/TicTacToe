package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    public static String retornarPosicoesLivres(char[][] tabuleiro) {
        StringBuilder posicoesLivres = new StringBuilder();

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == ' ') {
                    posicoesLivres.append(i).append(j).append(";");
                }
            }
        }

        if (posicoesLivres.length() > 0) {
            posicoesLivres.setLength(posicoesLivres.length() - 1);
        }

        return posicoesLivres.toString();
    }

    public static void main(String[] args) {
        char[][] tabuleiro = {
                {'X', ' ', 'O'},
                {' ', 'O', ' '},
                {'X', ' ', ' '}
        };

        String posicoesLivres = retornarPosicoesLivres(tabuleiro);
        System.out.println("Posições livres: " + posicoesLivres);
    }
}