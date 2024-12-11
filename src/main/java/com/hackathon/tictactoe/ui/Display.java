package com.hackathon.tictactoe.ui;

import net.jorgedev.ConsoleClear;

public class Display {

    public static void exibirTabuleiro(char[][] tabuleiro, int tamanhoTabuleiro) {
        ConsoleClear.run(); // Limpa o console
        System.out.println("\nTabuleiro Atual:");

        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                System.out.print("  " + tabuleiro[i][j] + "  ");
                if (j < tamanhoTabuleiro - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < tamanhoTabuleiro - 1) {
                // Adiciona separador horizontal
                for (int k = 0; k < tamanhoTabuleiro; k++) {
                    System.out.print("-----");
                    if (k < tamanhoTabuleiro - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void exibirEmpate() {
        System.out.println("\nO jogo terminou em empate!");
    }

    public static void splashScreen() {
        System.out.println("""
                ██   ██  █████   ██████ ██   ██  █████  ████████ ██   ██  ██████  ███    ██ 
                ██   ██ ██   ██ ██      ██  ██  ██   ██    ██    ██   ██ ██    ██ ████   ██ 
                ███████ ███████ ██      █████   ███████    ██    ███████ ██    ██ ██ ██  ██ 
                ██   ██ ██   ██ ██      ██  ██  ██   ██    ██    ██   ██ ██    ██ ██  ██ ██ 
                ██   ██ ██   ██  ██████ ██   ██ ██   ██    ██    ██   ██  ██████  ██   ████ 
                                                                                            
                """);
    }
}
