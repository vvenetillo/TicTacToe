package com.hackathon.tictactoe.ui;

import java.util.Random;

import org.fusesource.jansi.Ansi;

import net.jorgedev.ConsoleClear;

public class Display {

    public static void exibirTabuleiro(char[][] tabuleiro, int tamanhoTabuleiro, char caractereUsuario,
            char caractereComputador) {
        ConsoleClear.run();
        System.out.println(Display.logo() + "\n");
        System.out.println("\nTabuleiro Atual:");

        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                char caractere = tabuleiro[i][j];

                if (caractere == caractereUsuario) {
                    System.out.print(Ansi.ansi().fgBrightGreen().a("  " + caractere + "  ").reset());
                } else if (caractere == caractereComputador) {
                    System.out.print(Ansi.ansi().fgBrightRed().a("  " + caractere + "  ").reset());
                } else {
                    System.out.print("  " + caractere + "  ");
                }

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

    public static void exibirArteASCIIJogador() {
        System.out.println("\nParabéns! Você venceu!");
        System.out.println("     \\O/");
        System.out.println("      |");
        System.out.println("\n     / \\");
    }

    public static void exibirArteASCIIComputador() {
        System.out.println("\nO computador venceu!");
        System.out.println("    +---------------------+");
        System.out.println("    | +-----------------+ |");
        System.out.println("    | |                 | |");
        System.out.println("    | |      0   0      | |");
        System.out.println("    | |        -        | |");
        System.out.println("    | |      \\___/      | |");
        System.out.println("    | |                 | |");
        System.out.println("    | +-----------------+ |");
        System.out.println("    +--------+---+--------+");
        System.out.println("    _______|/     \\|_______");
        System.out.println("   /                        \\");
        System.out.println("  /   ********************   \\");
        System.out.println(" /  ***********************   \\");
        System.out.println("\n+------------------------------+");
    }

    public static void exibirEmpate() {
        System.out.println("\nOcorreu um empate!");
        System.out.println(" _______       _______ ");
        System.out.println("|       |     |       |");
        System.out.println("|   0   |  x  |   0   |");
        System.out.println("\n|_______|     |_______|");

    }

    public static String T() {
        return " /$$$$$$$$ \n" +
                "|__  $$__/ \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$   \n" +
                "   |__/  \n";
    }

    public static String T2() {
        return " /$$$$$$$$ \n" +
                "|__  $$__/ \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$   \n" +
                "  |__/  \n";
    }

    public static String T3() {
        return " /$$$$$$$$ \n" +
                "|__  $$__/ \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "   | $$    \n" +
                "    | $$   \n" +
                "     |__/  \n";
    }

    public static String i() {
        return "  /$$    \n" +
                " |__/    \n" +
                "   /$$   \n" +
                "  | $$   \n" +
                "  | $$   \n" +
                "  | $$   \n" +
                "   |__/   \n";
    }

    public static String t() {
        return "   /$$$$$$  \n" +
                "  /$$__  $$ \n" +
                " | $$  \\ $$ \n" +
                " | $$  | $$ \n" +
                " | $$$$$$/  \n" +
                "  \\____/    \n";
    }

    public static String a() {
        return "   /$$$$$$  \n" +
                "  |____  $$ \n" +
                "   /$$$$$$$ \n" +
                "  /$$__  $$ \n" +
                " |  $$$$$$$ \n" +
                "  \\_______/ \n";
    }

    public static String c() {
        return "   /$$$$$$$ \n" +
                "  /$$_____/ \n" +
                " | $$       \n" +
                " | $$       \n" +
                " | $$$$$$$  \n" +
                "  \\_______/ \n";
    }

    public static String o() {
        return "   /$$$$$$  \n" +
                "  /$$__  $$ \n" +
                " | $$  \\ $$ \n" +
                " | $$  | $$ \n" +
                " |  $$$$$$/ \n" +
                "  \\______/  \n";
    }

    public static String e() {
        return "   /$$$$$$  \n" +
                "  /$$__  $$ \n" +
                " | $$$$$$$$ \n" +
                " | $$_____/ \n" +
                " | $$$$$$$  \n" +
                "  \\_______/ \n";
    }

    public static String palavraColorida() {
        String[] letras = { T(), i(), c(), T2(), a(), c(), T3(), o(), e() };
        StringBuilder palavra = new StringBuilder();
        String[] linhas = new String[9];

        for (int i = 0; i < linhas.length; i++) {
            linhas[i] = "";
        }

        for (int i = 0; i < letras.length; i++) {
            String letra = letras[i];
            String[] partes = letra.split("\n");

            String cor = gerarCorAleatoriaParaLetra();

            for (int j = 0; j < 9; j++) {
                if (j < partes.length) {
                    linhas[j] += cor + partes[j] + "\u001B[0m";
                } else {
                    linhas[j] += "            ";
                }
            }
        }

        for (String linha : linhas) {
            palavra.append(linha).append("\n");
        }

        return palavra.toString();
    }

    public static String splashScreen() {
        String palavraColorida = palavraColorida();
        String textoGrupo = "\u001B[0m" + "                                            Grupo 6 apresenta..."
                + "\u001B[0m";

        return palavraColorida + "\n\n" + textoGrupo;
    }

    public static String logo() {
        return palavraColorida();
    }

    public static String gerarCorAleatoriaParaLetra() {
        Random random = new Random();
        double corEscolhida = random.nextInt(100);

        if (corEscolhida < 5) {
            return gerarCorAleatoria();
        } else {
            return "\u001B[0m";
        }
    }

    public static String gerarCorAleatoria() {
        Random random = new Random();
        int corEscolhida = random.nextInt(7);
        switch (corEscolhida) {
            case 0:
                return "\u001B[31m";
            case 1:
                return "\u001B[32m";
            case 2:
                return "\u001B[33m";
            case 3:
                return "\u001B[34m";
            case 4:
                return "\u001B[35m";
            case 5:
                return "\u001B[36m";
            case 6:
                return "\u001B[37m";
            default:
                return "\u001B[0m";
        }
    }

}
