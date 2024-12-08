package com.hackathon.tictactoe.game;

import java.util.Scanner;

import com.hackathon.tictactoe.ui.ConsoleUI;

import net.jorgedev.ConsoleClear;

public class TicTacToeGame {

   public static char[][] inicializarTabuleiro(char[][] tabuleiro) {
      for (int i = 0; i < tabuleiro.length; i++) {
         for (int j = 0; j < tabuleiro[i].length; j++) {
            tabuleiro[i][j] = ' ';
         }
      }
      return tabuleiro;
   }

   public static void exibirTabuleiro() {
      Scanner teste = new Scanner(System.in);

      ConsoleClear.run();
      char[][] tabuleiro = new char[3][3];
      inicializarTabuleiro(tabuleiro);

      System.out.println(ConsoleUI.Logo());
      for (char[] linha : tabuleiro) {
         for (char celula : linha) {
            System.out.print("[" + celula + "]");
         }
         System.out.println();
      }
      teste.nextLine();
      teste.close();
   }
}
