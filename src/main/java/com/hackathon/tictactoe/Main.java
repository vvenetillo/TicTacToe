package com.hackathon.tictactoe;

import com.hackathon.tictactoe.ui.ConsoleUI;
import com.hackathon.tictactoe.ui.Display;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Display.splashScreen());
        Thread.sleep(5000);
        ConsoleUI.exibirMenu();
    }
}
