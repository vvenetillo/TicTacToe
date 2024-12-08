package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    public static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
        for (int i = 0; i < tabuleiro.length; i++) {
            boolean venceu = true;
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] != caractereJogador) {
                    venceu = false;
                    break;
                }
            }
            if (venceu) return true;
        }
        return false;
    }
    public static boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
        for (int j = 0; j < tabuleiro[0].length; j++) {
            boolean venceu = true;
            for (int i = 0; i < tabuleiro.length; i++) {
                if (tabuleiro[i][j] != caractereJogador) {
                    venceu = false;
                    break;
                }
            }
            if (venceu) return true;
        }
        return false;
    }


    public static boolean teveGanhadorDiagonalPrincipal(char[][] tabuleiro, char caractereJogador) {
        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][i] != caractereJogador) {
                return false;
            }
        }
        return true;

    public static boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
        int n = tabuleiro.length;
        for (int i = 0; i < n; i++) {
            if (tabuleiro[i][n - 1 - i] != caractereJogador) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {'X', 'X', 'X'},
                {'O', 'O', ' '},
                {' ', 'O', ' '}
        };

        System.out.println("Jogador X venceu em linha? " + teveGanhadorLinha(tabuleiro, 'X'));
        System.out.println("Jogador O venceu em linha? " + teveGanhadorLinha(tabuleiro, 'O'));

        System.out.println("Jogador X venceu em coluna? " + teveGanhadorColuna(tabuleiro, 'X'));
        System.out.println("Jogador O venceu em coluna? " + teveGanhadorColuna(tabuleiro, 'O'));

        System.out.println("Jogador X venceu na diagonal principal? " + teveGanhadorDiagonalPrincipal(tabuleiro, 'X'));
        System.out.println("Jogador O venceu na diagonal secundária? " + teveGanhadorDiagonalSecundaria(tabuleiro, 'O'));
    }
}
