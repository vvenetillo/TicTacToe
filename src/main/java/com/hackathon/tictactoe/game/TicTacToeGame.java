package com.hackathon.tictactoe.game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

   public static int[] converterJogadaStringParaVetorInt(String jogada) {
      int[] vetorJogada = new int[2];
      vetorJogada[0] = Character.getNumericValue(jogada.charAt(0));
      vetorJogada[1] = Character.getNumericValue(jogada.charAt(1));
      return vetorJogada;
   }
   public static int[] obterJogadaComputador(String posicoesLivres, Scanner teclado) {
      String[] jogadasLivres = posicoesLivres.split(";");

      Random random = new Random();
      int indiceSorteado = random.nextInt(jogadasLivres.length);

      String jogadaSorteada = jogadasLivres[indiceSorteado];

      return converterJogadaStringParaVetorInt(jogadaSorteada);
   }

   public static void main(String[] args) {
      String posicoesLivres = "00;01;02;10;11;12;20;21;22";
      Scanner scanner = new Scanner(System.in);

      int[] jogadaComputador = obterJogadaComputador(posicoesLivres, scanner);
      System.out.println("Jogada do computador: Linha " + jogadaComputador[0] + ", Coluna " + jogadaComputador[1]);
   }
}