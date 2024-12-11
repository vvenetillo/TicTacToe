package com.hackathon.tictactoe.game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MoveValidator {

    private Board board;

    public MoveValidator(Board board) {
        this.board = board;
    }

    public boolean teveEmpate(char[][] tabuleiro) {
        for (int i = 0; i < board.getTamanhoTabuleiro(); i++) {
            for (int j = 0; j < board.getTamanhoTabuleiro(); j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
        return teveGanhadorLinha(tabuleiro, caractereJogador) ||
                teveGanhadorColuna(tabuleiro, caractereJogador) ||
                teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
                teveGanhadorDiagonalSecundaria(tabuleiro, caractereJogador);
    }

    private boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
        for (int i = 0; i < board.getTamanhoTabuleiro(); i++) {
            boolean venceu = true;
            for (int j = 0; j < board.getTamanhoTabuleiro(); j++) {
                if (tabuleiro[i][j] != caractereJogador) {
                    venceu = false;
                    break;
                }
            }
            if (venceu)
                return true;
        }
        return false;
    }

    private boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
        for (int j = 0; j < board.getTamanhoTabuleiro(); j++) {
            boolean venceu = true;
            for (int i = 0; i < board.getTamanhoTabuleiro(); i++) {
                if (tabuleiro[i][j] != caractereJogador) {
                    venceu = false;
                    break;
                }
            }
            if (venceu)
                return true;
        }
        return false;
    }

    private boolean teveGanhadorDiagonalPrincipal(char[][] tabuleiro, char caractereJogador) {
        for (int i = 0; i < board.getTamanhoTabuleiro(); i++) {
            if (tabuleiro[i][i] != caractereJogador) {
                return false;
            }
        }
        return true;
    }

    private boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
        for (int i = 0; i < board.getTamanhoTabuleiro(); i++) {
            if (tabuleiro[i][board.getTamanhoTabuleiro() - i - 1] != caractereJogador) {
                return false;
            }
        }
        return true;
    }

    public int[] obterJogadaUsuario(Scanner teclado, char[][] tabuleiro, char caractereUsuario) {
        int[] jogada = new int[2];
        boolean jogadaValida;

        do {
            try {
                System.out.print("Escolha a linha (1-" + board.getTamanhoTabuleiro() + "): ");
                jogada[0] = teclado.nextInt() - 1;
                System.out.print("Escolha a coluna (1-" + board.getTamanhoTabuleiro() + "): ");
                jogada[1] = teclado.nextInt() - 1;

                if (jogada[0] < 0 || jogada[0] >= board.getTamanhoTabuleiro() || jogada[1] < 0
                        || jogada[1] >= board.getTamanhoTabuleiro()) {
                    System.out.println("Coordenadas inválidas. Tente novamente.");
                    jogadaValida = false;
                } else if (tabuleiro[jogada[0]][jogada[1]] != ' ') {
                    System.out.println("Posição já ocupada. Escolha outra.");
                    jogadaValida = false;
                } else {
                    jogadaValida = true;
                }

                if (!jogadaValida) {
                    System.out.println("Pressione Enter para tentar novamente...");
                    teclado.nextLine(); // Consumir a linha restante
                    teclado.nextLine(); // Esperar a entrada do usuário
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                teclado.nextLine(); // Consumir a entrada inválida
                jogadaValida = false;
            }
        } while (!jogadaValida);

        return jogada;
    }

    public int[] obterJogadaComputador(char[][] tabuleiro) {
        Random random = new Random();
        int tamanhoTabuleiro = board.getTamanhoTabuleiro();
        int i, j;
        do {
            i = random.nextInt(tamanhoTabuleiro);
            j = random.nextInt(tamanhoTabuleiro);
        } while (tabuleiro[i][j] != ' ');
        return new int[] { i, j };
    }
}