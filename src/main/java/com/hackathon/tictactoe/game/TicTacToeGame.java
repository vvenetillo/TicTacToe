package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    private void processComputerMove() {
        // O computador escolhe a jogada automaticamente
        int move = getComputerMove();  
        board.makeMove(currentPlayer, move);  // Realiza a jogada do computador
        ui.displayBoard(board);  // Exibe o tabuleiro após a jogada
    }
    
    private int getComputerMove() {
        // Estratégia simples: escolhe a primeira posição vazia
        for (int i = 0; i < board.getSize(); i++) {
            if (board.getCell(i) == ' ') {  // Verifica se a célula está vazia
                return i;  // Retorna a primeira posição disponível
            }
        }
        return -1;  // Caso não haja espaço, o que não deveria acontecer
    }
    
}
