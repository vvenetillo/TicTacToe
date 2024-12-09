import java.util.Scanner;

public class TicTacToeGame {

    private char[] board = new char[9];  // Tabuleiro com 9 espaços
    private char currentPlayer = 'X';  // Jogador atual (X ou O)
    
    public TicTacToeGame() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';  // Inicializa o tabuleiro vazio
        }
    }

    private void processarAVezDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        int move;

        System.out.println("Vez do jogador " + currentPlayer + ". Digite uma posição (0 a 8): ");
        move = scanner.nextInt();  // Obtém a jogada do usuário

        // Valida a jogada (deve ser uma posição livre)
        if (move >= 0 && move < 9 && board[move] == ' ') {
            board[move] = currentPlayer;  // Realiza a jogada
            displayBoard();  // Exibe o tabuleiro após a jogada
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
        }
    }

    private void displayBoard() {
        // Exibe o tabuleiro
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.processarAVezDoUsuario();  // Chama a função para o primeiro turno
    }
}
