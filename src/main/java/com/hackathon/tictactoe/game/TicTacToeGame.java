package com.hackathon.tictactoe.game;

import java.util.Scanner;

public class TicTacToeGame {

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
