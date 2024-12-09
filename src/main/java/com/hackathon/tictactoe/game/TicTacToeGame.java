package com.hackathon.tictactoe.game;
import java.util.Scanner;

public class TicTacToeGame {

    private char[] tabuleiro = new char[9];  // Tabuleiro com 9 espaços
    private char jogadorAtual = 'X';  // Jogador atual (X ou O)
    
    public TicTacToeGame() {
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = ' ';  // Inicializa o tabuleiro vazio
        }
    }

    private void processarVezDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int jogada;

        System.out.println("Vez do jogador " + jogadorAtual + ". Digite uma posição (0 a 8): ");
        jogada = scanner.nextInt();  // Obtém a jogada do usuário

        // Valida a jogada (deve ser uma posição livre)
        if (jogada >= 0 && jogada < 9 && tabuleiro[jogada] == ' ') {
            tabuleiro[jogada] = jogadorAtual;  // Realiza a jogada
            exibirTabuleiro();  // Exibe o tabuleiro após a jogada
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
        }
    }

    private void exibirTabuleiro() {
        // Exibe o tabuleiro
        for (int i = 0; i < 9; i++) {
            System.out.print(tabuleiro[i] + " ");
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        TicTacToeGame jogo = new TicTacToeGame();
        jogo.processarVezDoUsuario();  // Chama a função para o primeiro turno
    }
}
