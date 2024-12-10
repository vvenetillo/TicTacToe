package com.hackathon.tictactoe.config;

import java.util.Random;

public class GameConfig {

    public static boolean sortearValorBooleano() {
        Random sorteio = new Random();
        return sorteio.nextBoolean();
    }

}
