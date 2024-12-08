package com.hackathon.tictactoe;

<<<<<<< HEAD
import net.jorgedev.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");
        ConsoleClear.run();
        System.out.println("Hello World!");
    }
} 
=======
import com.hackathon.tictactoe.game.TicTacToeGame;
import com.hackathon.tictactoe.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ConsoleUI.exibirMenu();
        TicTacToeGame.exibirVitoriaUsuario();
    }
}
>>>>>>> 021fc07e5e79d37dbb155d63dbe34ad623238d2b
