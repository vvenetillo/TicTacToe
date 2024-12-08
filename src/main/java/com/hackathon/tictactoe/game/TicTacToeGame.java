package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    private void processUserMove() {
        // Obtém a jogada do usuário
        int move = ui.getPlayerMove();  
        
        // Valida a jogada do usuário
        if (moveValidator.isValidMove(move)) {
            board.makeMove(currentPlayer, move);  // Realiza a jogada do usuário
            ui.displayBoard(board);  // Exibe o tabuleiro após a jogada
        } else {
            ui.displayInvalidMove();  // Informa que a jogada é inválida
        }
    }

}
