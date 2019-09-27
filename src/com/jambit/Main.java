package com.jambit;

import com.jambit.Intro;
import highscore.SaveGame;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        GameState.name = "Test";
//        Functions.addXp();
//        SaveGame.setHighscore();
//        SaveGame.showHighscore();

        GameStart start = new GameStart();
        start.run();

    }
}
