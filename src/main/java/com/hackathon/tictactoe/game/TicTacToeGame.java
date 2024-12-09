package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    private char[] tabuleiro = new char[9];  // Tabuleiro com 9 espaços
    private char jogadorAtual = 'X';  // Jogador atual (X ou O)
    
    public TicTacToeGame() {
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = ' ';  // Inicializa o tabuleiro vazio
        }
    }

    private void processarAVezDoComputador() {
        int jogada = obterJogadaComputador();  // O computador escolhe a jogada automaticamente
        if (jogada != -1) {
            tabuleiro[jogada] = jogadorAtual;  // Realiza a jogada do computador
            exibirTabuleiro();  // Exibe o tabuleiro após a jogada
        }
    }
    
    private int obterJogadaComputador() {
        // Estratégia simples: escolhe a primeira posição vazia
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i] == ' ') {  // Verifica se a célula está vazia
                return i;  // Retorna a primeira posição disponível
            }
        }
        return -1;  // Caso não haja espaço, o que não deveria acontecer
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
        jogo.processarAVezDoComputador();  // Chama a função para o primeiro turno do computador
    }
}

