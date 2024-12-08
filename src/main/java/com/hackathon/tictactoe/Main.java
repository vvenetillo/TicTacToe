package com.hackathon.tictactoe;

import com.hackathon.tictactoe.ui.ConsoleUI;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    System.out.println(ConsoleUI.splashScreen());
    Thread.sleep(5000);
    ConsoleUI.exibirMenu();
  }
}