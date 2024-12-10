package com.hackathon.tictactoe.game;


public class TicTacToeGame {
    static boolean jogadaValida(String posicoesLivres, int linha, int coluna) { 
        String posicao = linha + "," + coluna; 
        return posicoesLivres.contains(posicao); }
    }