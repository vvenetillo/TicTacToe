package com.hackathon.tictactoe.game;

import net.jorgedev.ConsoleClear;

import java.util.Scanner;

import com.hackathon.tictactoe.ui.ConsoleUI;

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

   private static final char[] CARACTERES_IDENTIFICADORES_ACEITOS = { 'X', 'O' };

   public static char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
      char caractereComputador;

      while (true) {
         System.out.print("Escolha o caractere para o computador (X ou O): ");
         caractereComputador = teclado.next().charAt(0);

         boolean valido = false;
         for (char c : CARACTERES_IDENTIFICADORES_ACEITOS) {
            if (c == caractereComputador && c != caractereUsuario) {
               valido = true;
               break;
            }
         }

         if (valido) {
            break;
         } else {
            System.out.println("Caractere inválido ou já escolhido pelo usuário! Por favor, tente novamente.");
         }
      }

      return caractereComputador;
   }

   public static int[] converterJogadaStringParaVetorInt(String jogada) {
      int[] vetorJogada = new int[2];

      vetorJogada[0] = Character.getNumericValue(jogada.charAt(0));
      vetorJogada[1] = Character.getNumericValue(jogada.charAt(1));

      return vetorJogada;
   }

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
