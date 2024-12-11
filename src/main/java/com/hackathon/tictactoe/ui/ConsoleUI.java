package com.hackathon.tictactoe.ui;

import com.hackathon.tictactoe.game.TicTacToeGame;

import net.jorgedev.ConsoleClear;

import java.util.Scanner;

public class ConsoleUI {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void exibirMenu() {
        int escolha = -1;

        while (escolha != 3) {
            ConsoleClear.run();
            System.out.println(logo());
            System.out.println("=== Menu Interativo ===");
            System.out.println("1- Jogar Jogo da Velha");
            System.out.println("2- Sobre o Jogo");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            try {
                escolha = Integer.parseInt(SCANNER.nextLine());

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
    }

    private static void iniciarJogo() {
        TicTacToeGame jogo = new TicTacToeGame();
        jogo.executarJogo();
    }

    private static void sobreOJogo() {
        ConsoleClear.run();
        System.out.println(logo());
        System.out.println(
                """
                        O Jogo da Velha foi um projeto idealizado pelo professor Rogério da Turma 4 do Programa 1000 Devs,
                        realizado pela Mesttra em parceria com a Johnson & Johnson MedTech e o Hospital Israelita Albert Einstein.

                        Nosso jogo recebeu o nome de TicTacToe e foi desenvolvido utilizando:
                        - Linguagem de programação: Java
                        - Controle de versionamento: Git e Gitflow

                        ### Membros do Grupo 6 ###
                        - Jorge Luis: Líder Técnico
                        - José Victor: Líder People
                        - Arthur Ramalho
                        - Gilvan Ribeiro
                        - Lorena Gouveia
                        - Hyngred Menezes
                        - Luan Nascimento

                        Versão: 1.0
                        Build: 11/12/2024

                        Pressione Enter para voltar ao menu...
                        """);
        SCANNER.nextLine();
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