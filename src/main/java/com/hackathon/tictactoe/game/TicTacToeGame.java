package com.hackathon.tictactoe.game;

import net.jorgedev.ConsoleClear;

import java.util.Scanner;

public class TicTacToeGame {
   public static void exibirTabuleiro(char[][] tabuleiro) {
      ConsoleClear.run();

      System.out.println("Tabuleiro:");
      for (int i = 0; i < tabuleiro.length; i++) {
         for (int j = 0; j < tabuleiro[i].length; j++) {
            System.out.print("[" + tabuleiro[i][j] + "]");
         }
         System.out.println();
      }
   }

   public static void exibirVitoriaUsuario() {
      System.out.println("O jogador venceu!");

      System.out.println(" _____");
      System.out.println(" |^ ^|");
      System.out.println(" /   \\");
      System.out.println(" \\ U /");
      System.out.println(" |||||");

   }

   private static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = { 'X', 'O' };

   public static char obterCaractereUsuario(Scanner teclado) {
      char caractereUsuario;

      while (true) {
         System.out.print("Escolha o caractere que deseja usar (X ou O): ");
         caractereUsuario = teclado.next().charAt(0);

         boolean valido = false;
         for (char c : CARACTERES_IDENTIFICADORES_ACEITOS) {
            if (c == caractereUsuario) {
               valido = true;
               break;
            }
         }

         if (valido) {
            break;
         } else {
            System.out.println("Caractere inválido! Por favor, escolha apenas X ou O.");
         }
      }

      return caractereUsuario;
   }
}
