package com.hackathon.tictactoe.game;

import java.util.Scanner;

import com.hackathon.tictactoe.ui.ConsoleUI;

import net.jorgedev.ConsoleClear;

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

   public static void exibirEmpate()  {
      System.out.println("Ocorreu um empate!");
  
      System.out.println(" _______       _______ ");
      System.out.println("|       |     |       |");
      System.out.println("|   0   |  x  |   0   |");
      System.out.println("|_______|     |_______|");
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

   public static String retornarPosicoesLivres(char[][] tabuleiro) {
      StringBuilder posicoesLivres = new StringBuilder();

      for (int i = 0; i < tabuleiro.length; i++) {
         for (int j = 0; j < tabuleiro[i].length; j++) {
            if (tabuleiro[i][j] == ' ') {
               posicoesLivres.append(i).append(j).append(";");
            }
         }
      }

      if (posicoesLivres.length() > 0) {
         posicoesLivres.setLength(posicoesLivres.length() - 1);
      }

      return posicoesLivres.toString();
   }

   public static boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
      return teveGanhadorLinha(tabuleiro, caractereJogador) ||
            teveGanhadorColuna(tabuleiro, caractereJogador) ||
            teveGanhadorDiagonalPrincipal(tabuleiro, caractereJogador) ||
            teveGanhadorDiagonalSecundaria(tabuleiro, caractereJogador);
   }

   public static boolean teveGanhadorLinha(char[][] tabuleiro, char caractereJogador) {
      for (int i = 0; i < tabuleiro.length; i++) {
         boolean venceu = true;
         for (int j = 0; j < tabuleiro[i].length; j++) {
            if (tabuleiro[i][j] != caractereJogador) {
               venceu = false;
               break;
            }
         }
         if (venceu)
            return true;
      }
      return false;
   }

   public static boolean teveGanhadorColuna(char[][] tabuleiro, char caractereJogador) {
      for (int j = 0; j < tabuleiro[0].length; j++) {
         boolean venceu = true;
         for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][j] != caractereJogador) {
               venceu = false;
               break;
            }
         }
         if (venceu)
            return true;
      }
      return false;
   }

   public static boolean teveGanhadorDiagonalPrincipal(char[][] tabuleiro, char caractereJogador) {
      for (int i = 0; i < tabuleiro.length; i++) {
         if (tabuleiro[i][i] != caractereJogador) {
            return false;
         }
      }
      return true;
   }

   public static boolean teveGanhadorDiagonalSecundaria(char[][] tabuleiro, char caractereJogador) {
      int n = tabuleiro.length;
      for (int i = 0; i < n; i++) {
         if (tabuleiro[i][n - 1 - i] != caractereJogador) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      char[][] tabuleiro = {
            { 'X', 'X', 'X' },
            { 'O', 'O', ' ' },
            { ' ', 'O', ' ' }
      };

      System.out.println("Jogador X venceu em linha? " + teveGanhadorLinha(tabuleiro, 'X'));
      System.out.println("Jogador O venceu em linha? " + teveGanhadorLinha(tabuleiro, 'O'));

      System.out.println("Jogador X venceu em coluna? " + teveGanhadorColuna(tabuleiro, 'X'));
      System.out.println("Jogador O venceu em coluna? " + teveGanhadorColuna(tabuleiro, 'O'));

      System.out.println("Jogador X venceu na diagonal principal? " + teveGanhadorDiagonalPrincipal(tabuleiro, 'X'));
      System.out.println("Jogador O venceu na diagonal secundária? " + teveGanhadorDiagonalSecundaria(tabuleiro, 'O'));
   }
}
