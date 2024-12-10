package com.hackathon.tictactoe.game;

import java.util.Random;
import java.util.Scanner;
import com.hackathon.tictactoe.ui.ConsoleUI;
import net.jorgedev.ConsoleClear;

public class TicTacToeGame {

   public static int[] converterJogadaStringParaVetorInt(String jogada) {
      int[] vetorJogada = new int[2];
      vetorJogada[0] = Character.getNumericValue(jogada.charAt(0));
      vetorJogada[1] = Character.getNumericValue(jogada.charAt(1));
      return vetorJogada;
   }

   public static void exibirEmpate() {
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

   public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
      String[] jogadasLivres = posicoesLivres.split(";");

      Random random = new Random();
      int indiceSorteado = random.nextInt(jogadasLivres.length);

      String jogadaSorteada = jogadasLivres[indiceSorteado];

      return converterJogadaStringParaVetorInt(jogadaSorteada);
   }

   public static boolean jogadaValida(String posicoesLivres, int linha, int coluna) {
      String jogada = linha + "" + coluna;
      return posicoesLivres.contains(jogada);
   }

   public static int[] obterJogadaUsuario(String posicoesLivres, Scanner teclado) {
      int[] jogadaUsuario = new int[2];

      while (true) {
         try {
            System.out.println("Digite a linha e a coluna que deseja jogar (separados por espaço):");
            String entrada = teclado.nextLine().trim();
            String[] valores = entrada.split(" ");

            if (valores.length != 2) {
               System.out.println("Entrada inválida! Você deve digitar dois números separados por espaço.");
               continue;
            }
            int linha = Integer.parseInt(valores[0]) - 1;
            int coluna = Integer.parseInt(valores[1]) - 1;

            if (!jogadaValida(posicoesLivres, linha, coluna)) {
               System.out.println("Jogada inválida! A posição escolhida já está ocupada ou não existe.");
               continue;
            }
            jogadaUsuario[0] = linha;
            jogadaUsuario[1] = coluna;
            break;
         } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Você deve digitar números.");
         }
      }
      return jogadaUsuario;
   }

   private void processarAVezDoComputador() {
      int jogada = obterJogadaComputador();
      if (jogada != -1) {
         tabuleiro[jogada] = jogadorAtual;
         exibirTabuleiro();
      }
   }

   private void processarVezDoUsuario() {
      Scanner scanner = new Scanner(System.in);
      int jogada;

      System.out.println("Vez do jogador " + jogadorAtual + ". Digite uma posição (0 a 8): ");
      jogada = scanner.nextInt();

      if (jogada >= 0 && jogada < 9 && tabuleiro[jogada] == ' ') {
         tabuleiro[jogada] = jogadorAtual;
         exibirTabuleiro();
      } else {
         System.out.println("Jogada inválida. Tente novamente.");
      }
   }

   public static char[][] retornarTabuleiroAtualizado(char[][] tabuleiro, int[] jogada, char caractereJogador) {
      tabuleiro[jogada[0]][jogada[1]] = caractereJogador;
      return tabuleiro;
   }
}