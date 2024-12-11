package com.hackathon.tictactoe;

import com.hackathon.tictactoe.ui.ConsoleUI;
import com.hackathon.tictactoe.ui.Display;

public class Main {
    public static void main(String[] args) {
        // Exibe a tela inicial (splash screen)
        Display.splashScreen();

        // Exibe o menu interativo
        ConsoleUI.exibirMenu();
    }
}
