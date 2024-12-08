package com.hackathon.tictactoe.game;

public class TicTacToeGame {

    public static int[] converterJogadaStringParaVetorInt(String jogada) {
        int[] vetorJogada = new int[2];

        vetorJogada[0] = Character.getNumericValue(jogada.charAt(0));
        vetorJogada[1] = Character.getNumericValue(jogada.charAt(1));

        return vetorJogada;
    }

    public static void main(String[] args) {
        String jogada = "12"; // Linha 1, Coluna 2
        int[] vetor = converterJogadaStringParaVetorInt(jogada);
        
        System.out.println("Jogada convertida: [" + vetor[0] + ", " + vetor[1] + "]");
    }
}
