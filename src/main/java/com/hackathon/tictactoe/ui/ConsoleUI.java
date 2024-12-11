package com.hackathon.tictactoe.ui;

import com.hackathon.tictactoe.game.TicTacToeGame;

import net.jorgedev.ConsoleClear;

import java.util.Scanner;

public class ConsoleUI {

    public static void exibirMenu() {

        Scanner scanner = new Scanner(System.in);
        int escolha = -1;
        ConsoleClear.run();

        while (escolha != 3) {
            System.out.println(logo());
            System.out.println("=== Menu Interativo ===");
            System.out.println("1- Jogar Jogo da Velha");
            System.out.println("2- Sobre o Jogo");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            try {
                escolha = Integer.parseInt(scanner.nextLine());

                switch (escolha) {
                    case 1 -> iniciarJogo();
                    case 2 -> sobreOJogo();
                    case 3 -> System.out.println("Saindo do jogo... Até mais!");
                    default -> System.out.println("Opção inválida. Escolha novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Selecione um número correspondente a uma opção.");
            }
        }

        scanner.close();
    }

    private static void iniciarJogo() {
        TicTacToeGame jogo = new TicTacToeGame();
        jogo.executarJogo();
    }

    private static void sobreOJogo() {
        System.out.println(logo());
        System.out.println(
                "O JOGO DA VELHA é um jogo de estratégia clássico, também conhecido como três em linha, comumente jogado entre dois participantes.");
        System.out.println("\nPressione Enter para voltar ao menu...");
        new Scanner(System.in).nextLine();
    }

    private static String logo() {
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
}