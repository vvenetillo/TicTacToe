package com.hackathon.tictactoe.ui;

import com.hackathon.tictactoe.game.TicTacToeGame;

import net.jorgedev.ConsoleClear;

import java.util.Scanner;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

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
        AnsiConsole.systemInstall();

        System.out.println(logo());
        System.out.println(Ansi.ansi()
                .fgBrightDefault().a("O Jogo da Velha foi um projeto idealizado pelo professor ").reset()
                .fgBrightDefault().a("Rogério Freitas da Turma 4 do Programa 1000Devs,\n").reset()
                .fgBrightDefault().a("realizado pela ").reset()
                .fgBrightMagenta().a("mesttra ").reset()
                .fgBrightDefault().a("em parceria com a ").reset()
                .fgBrightRed().a("Johnson & Johnson MedTech ").reset()
                .fgBrightDefault().a("e o ").reset()
                .fgBrightBlue().a("Hospital Israelita Albert Einstein.\n\n").reset());

        System.out.println(Ansi.ansi()
                .fgBrightDefault().a("Nosso jogo recebeu o nome de TicTacToe e foi desenvolvido utilizando:\n").reset()
                .fgBrightDefault().a("- Linguagem de programação: Java com Maven\n").reset()
                .fgBrightDefault().a("- Controle de versionamento: Git e Gitflow\n\n").reset());

        System.out.println(Ansi.ansi()
                .fgBrightDefault().a("### Membros do Grupo 6 ###\n").reset()
                .fgBrightBlue().a("- Jorge Luis: Líder Técnico\n").reset()
                .fgBrightGreen().a("- José Victor: Líder People\n").reset()
                .fgBrightDefault().a("- Arthur Ramalho\n").reset()
                .fgBrightDefault().a("- Gilvan Ribeiro\n").reset()
                .fgBrightDefault().a("- Lorena Gouveia\n").reset()
                .fgBrightDefault().a("- Hyngred Menezes\n").reset()
                .fgBrightDefault().a("- Luan Nascimento\n\n").reset());

        System.out.println(Ansi.ansi()
                .fgBrightDefault().a("Versão: 1.0\n").reset()
                .fgBrightDefault().a("Build: 12/12/2024\n\n").reset());

        System.out.println(Ansi.ansi()
                .fgBrightGreen().a("Pressione Enter para voltar ao menu...\n").reset());

        AnsiConsole.systemUninstall();
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