package com.hackathon.tictactoe.game;

import com.hackathon.tictactoe.ui.ConsoleUI;
import com.hackathon.tictactoe.ui.Display;

import net.jorgedev.ConsoleClear;

import com.hackathon.tictactoe.config.GameConfig;

import java.util.Scanner;

public class TicTacToeGame {

   private Board board;
   private MoveValidator moveValidator;
   private char caractereUsuario;
   private char caractereComputador;

   public TicTacToeGame() {
      configurarJogo();
   }

   public void configurarJogo() {
      Scanner teclado = new Scanner(System.in);
      ConsoleClear.run();
      System.out.println(Display.logo());
      System.out.print("Escolha o tamanho do tabuleiro (ex.: 3 para 3x3, 4 para 4x4): ");
      int tamanhoTabuleiro = teclado.nextInt();
      board = new Board(tamanhoTabuleiro);
      moveValidator = new MoveValidator(board);

      caractereUsuario = obterCaractereUsuario(teclado);

      caractereComputador = obterCaractereComputador(teclado, caractereUsuario);

      board.inicializarTabuleiro();
   }

   public void executarJogo() {
      Scanner teclado = new Scanner(System.in);

      boolean vezUsuario = GameConfig.sortearValorBooleano();
      boolean jogoContinua = true;

      while (jogoContinua) {
         Display.exibirTabuleiro(board.getTabuleiro(), board.getTamanhoTabuleiro());

         if (vezUsuario) {
            board.setTabuleiro(processarVezUsuario(teclado, board.getTabuleiro(), caractereUsuario));

            if (teveGanhador(board.getTabuleiro(), caractereUsuario)) {
               Display.exibirTabuleiro(board.getTabuleiro(), board.getTamanhoTabuleiro());
               exibirArteASCIIJogador();
               esperarEnter(teclado);
               jogoContinua = false;
            } else if (teveEmpate(board.getTabuleiro())) {
               Display.exibirTabuleiro(board.getTabuleiro(), board.getTamanhoTabuleiro());
               Display.exibirEmpate();
               esperarEnter(teclado);
               jogoContinua = false;
            } else {
               vezUsuario = false;
            }
         } else {
            board.setTabuleiro(processarVezComputador(board.getTabuleiro(), caractereComputador));

            if (teveGanhador(board.getTabuleiro(), caractereComputador)) {
               Display.exibirTabuleiro(board.getTabuleiro(), board.getTamanhoTabuleiro());
               exibirArteASCIIComputador();
               esperarEnter(teclado);
               jogoContinua = false;
            } else if (teveEmpate(board.getTabuleiro())) {
               Display.exibirTabuleiro(board.getTabuleiro(), board.getTamanhoTabuleiro());
               Display.exibirEmpate();
               esperarEnter(teclado);
               jogoContinua = false;
            } else {
               vezUsuario = true;
            }
         }
      }

      ConsoleUI.exibirMenu();
   }

   private boolean teveEmpate(char[][] tabuleiro) {
      return moveValidator.teveEmpate(tabuleiro);
   }

   private boolean teveGanhador(char[][] tabuleiro, char caractereJogador) {
      return moveValidator.teveGanhador(tabuleiro, caractereJogador);
   }

   private char obterCaractereUsuario(Scanner teclado) {
      char caractere;
      String caracteresAceitos = "XO0UC";
      boolean valido;

      do {
         System.out.print("Escolha seu caractere (X, O, 0, U, C): ");
         caractere = teclado.next().toUpperCase().charAt(0);
         valido = caracteresAceitos.indexOf(caractere) != -1;
         if (!valido) {
            System.out.println("Caractere inválido. Escolha novamente.");
         }
      } while (!valido);

      return caractere;
   }

   private char obterCaractereComputador(Scanner teclado, char caractereUsuario) {
      String caracteresAceitos = "XO0UC";
      for (char c : caracteresAceitos.toCharArray()) {
         if (c != caractereUsuario) {
            return c;
         }
      }
      return ' ';
   }

   private char[][] processarVezUsuario(Scanner teclado, char[][] tabuleiro, char caractereUsuario) {
      System.out.println("Jogador, é sua vez!");
      int[] jogada = moveValidator.obterJogadaUsuario(teclado, tabuleiro, caractereUsuario);
      return board.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereUsuario);
   }

   private char[][] processarVezComputador(char[][] tabuleiro, char caractereComputador) {
      System.out.println("Computador está jogando...");
      int[] jogada = moveValidator.obterJogadaComputador(tabuleiro);
      return board.retornarTabuleiroAtualizado(tabuleiro, jogada, caractereComputador);
   }

   private void exibirArteASCIIJogador() {
      System.out.println("Parabéns! Você venceu!");
      System.out.println("     \\O/");
      System.out.println("      |");
      System.out.println("     / \\");
   }

   private void exibirArteASCIIComputador() {
      System.out.println("O computador venceu!");
      System.out.println("    +---------------------+");
      System.out.println("    | +-----------------+ |");
      System.out.println("    | |                 | |");
      System.out.println("    | |      0   0      | |");
      System.out.println("    | |        -        | |");
      System.out.println("    | |      \\___/      | |");
      System.out.println("    | |                 | |");
      System.out.println("    | +-----------------+ |");
      System.out.println("    +--------+---+--------+");
      System.out.println("    _______|/     \\|_______");
      System.out.println("   /                        \\");
      System.out.println("  /   ********************   \\");
      System.out.println(" /  ***********************   \\");
      System.out.println("+------------------------------+");
   }

   private void esperarEnter(Scanner teclado) {
      System.out.println("Pressione Enter para continuar...");
      teclado.nextLine();
      teclado.nextLine();
   }
}