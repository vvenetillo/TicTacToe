package com.hackathon.tictactoe.ui;

import net.jorgedev.ConsoleClear;

public class Display {

    public static void exibirTabuleiro(char[][] tabuleiro, int tamanhoTabuleiro) {
        ConsoleClear.run();
        System.out.println(Display.logo());
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
        System.out.println("\nOcorreu um empate!");
        System.out.println(" _______       _______ ");
        System.out.println("|       |     |       |");
        System.out.println("|   0   |  x  |   0   |");
        System.out.println("|_______|     |_______|");

    }

    public static String logo() {
        return """
                 /$$$$$$$$ /$$        /$$$$$$$$               /$$$$$$$$
                |__  $$__/|__/       |__  $$__/              |__  $$__/
                   | $$    /$$  /$$$$$$$| $$  /$$$$$$   /$$$$$$$| $$  /$$$$$$   /$$$$$$
                   | $$   | $$ /$$_____/| $$ |____  $$ /$$_____/| $$ /$$__  $$ /$$__  $$
                   | $$   | $$| $$      | $$  /$$$$$$$| $$      | $$| $$  \\ $$| $$$$$$$$
                   | $$   | $$| $$      | $$ /$$__  $$| $$      | $$| $$  | $$| $$_____/
                   | $$   | $$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$$| $$|  $$$$$$/|  $$$$$$$
                   |__/   |__/ \\_______/|__/ \\_______/ \\_______/|__/ \\______/  \\_______/
                """;
    }

    public static String splashScreen() {
        return """
                 /$$$$$$$$ /$$        /$$$$$$$$               /$$$$$$$$
                |__  $$__/|__/       |__  $$__/              |__  $$__/
                   | $$    /$$  /$$$$$$$| $$  /$$$$$$   /$$$$$$$| $$  /$$$$$$   /$$$$$$
                   | $$   | $$ /$$_____/| $$ |____  $$ /$$_____/| $$ /$$__  $$ /$$__  $$
                   | $$   | $$| $$      | $$  /$$$$$$$| $$      | $$| $$  \\ $$| $$$$$$$$
                   | $$   | $$| $$      | $$ /$$__  $$| $$      | $$| $$  | $$| $$_____/
                   | $$   | $$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$$| $$|  $$$$$$/|  $$$$$$$
                   |__/   |__/ \\_______/|__/ \\_______/ \\_______/|__/ \\______/  \\_______/

                                         Grupo 6 apresenta...
                """;
    }

}
