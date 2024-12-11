package com.hackathon.tictactoe.ui;

import com.hackathon.tictactoe.game.TicTacToeGame;
import net.jorgedev.ConsoleClear;

import java.util.Scanner;

public class ConsoleUI {

    // Exibe o menu principal
    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        while (escolha != 3) {
            ConsoleClear.run();
            System.out.println(logo());
            System.out.println("=== Menu Interativo ===");
            System.out.println("1- Jogar Jogo da Velha");
            System.out.println("2- Sobre o Jogo");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine();

            try {
                escolha = Integer.parseInt(input);

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

    // Inicializa o jogo
    static void iniciarJogo() {
        TicTacToeGame jogo = new TicTacToeGame();
        jogo.executarJogo();
    }

    // Exibe informações sobre o jogo
    static void sobreOJogo() {
        ConsoleClear.run();
        System.out.println(logo());
        System.out.println(
                "O JOGO DA VELHA é um jogo de estratégia clássico, também conhecido como três em linha, comumente jogado entre dois participantes.");
        voltar(new Scanner(System.in));
    }

    // Aguarda o usuário pressionar "Enter" para voltar ao menu
    private static void voltar(Scanner scanner) {
        System.out.println("\nPressione Enter para voltar ao menu...");
        scanner.nextLine();
    }

    // ASCII Art para o menu principal
    public static String logo() {
        return """
                ████████ ██  ██████ ████████  █████   ██████ ████████  ██████  ███████ 
                   ██    ██ ██         ██    ██   ██ ██         ██    ██    ██ ██      
                   ██    ██ ██         ██    ███████ ██         ██    ██    ██ █████ 
                   ██    ██ ██         ██    ██   ██ ██         ██    ██    ██ ██    
                   ██    ██  ██████    ██    ██   ██  ██████    ██     ██████  ███████ 
                                                                                       
                """;
    }
}