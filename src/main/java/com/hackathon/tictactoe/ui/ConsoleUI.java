package com.hackathon.tictactoe.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUI {

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        while (escolha != 3) {
            System.out.println("=== Menu Interativo ===");
            System.out.println("1- Iniciar Jogo");
            System.out.println("2- Sobre o Jogo");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            try {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        iniciarJogo();
                        break;
                    case 2:
                        sobreOJogo();
                        break;
                    case 3:
                        System.out.println("Saindo do programa. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        }

        scanner.close();
    }

    static void iniciarJogo() {
        System.out.println("Jogo iniciado!");
    }

    static void sobreOJogo() {
        System.out.println(
                "O JOGO DA VELHA é também um jogo popular e pode ser conhecido por outros nomes diferentes como:\n jogo do galo ou três em linha.");
    }
}
