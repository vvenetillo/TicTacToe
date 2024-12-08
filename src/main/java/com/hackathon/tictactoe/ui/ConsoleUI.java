package com.hackathon.tictactoe.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.hackathon.tictactoe.game.TicTacToeGame;

import net.jorgedev.ConsoleClear;

public class ConsoleUI {

    public static String Logo() {
        String asciiArt = """
                ████████ ██  ██████ ████████  █████   ██████ ████████  ██████  ███████ 
                   ██    ██ ██         ██    ██   ██ ██         ██    ██    ██ ██      
                   ██    ██ ██         ██    ███████ ██         ██    ██    ██ █████ 
                   ██    ██ ██         ██    ██   ██ ██         ██    ██    ██ ██    
                   ██    ██  ██████    ██    ██   ██  ██████    ██     ██████  ███████ 
                                                                                       

                """;
        return asciiArt;
    }

    public static String splashScreen() {
        String asciiArt = """
                ██   ██  █████   ██████ ██   ██  █████  ████████ ██   ██  ██████  ███    ██ 
                ██   ██ ██   ██ ██      ██  ██  ██   ██    ██    ██   ██ ██    ██ ████   ██ 
                ███████ ███████ ██      █████   ███████    ██    ███████ ██    ██ ██ ██  ██ 
                ██   ██ ██   ██ ██      ██  ██  ██   ██    ██    ██   ██ ██    ██ ██  ██ ██ 
                ██   ██ ██   ██  ██████ ██   ██ ██   ██    ██    ██   ██  ██████  ██   ████ 
                                                                                            

                Grupo 6 apresenta...
                """;

        return asciiArt;
    }

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        while (escolha != 3) {
            ConsoleClear.run();
            System.out.println(Logo());
            System.out.println("=== Menu Interativo ===");
            System.out.println("1- Iniciar Jogo");
            System.out.println("2- Sobre o Jogo");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine();

            try {
                if (input.trim().isEmpty()) {
                    throw new InputMismatchException("Opção inválida. Por favor, escolha uma opção válida.");
                }

                escolha = Integer.parseInt(input);

                switch (escolha) {
                    case 1:
                        TicTacToeGame.exibirTabuleiro();
                        break;
                    case 2:
                        sobreOJogo();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        scanner.nextLine();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira uma opção válida.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    static void sobreOJogo() {
        ConsoleClear.run();
        System.out.println(Logo());
        System.out.println(
                "O JOGO DA VELHA é também um jogo popular e pode ser conhecido por outros nomes diferentes como:\n jogo do galo ou três em linha.");
        voltar(new Scanner(System.in));
    }

    private static void voltar(Scanner scanner) {
        System.out.println("\nPressione qualquer tecla para voltar ao Menu...");
        scanner.nextLine();
        voltar(new Scanner(System.in));
    }
}