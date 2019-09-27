package com.jambit;



public class LevelSystem {
public static int playerLevel = 0;
    static void levelUp(){
    if(GameState.xp >= 1000 && playerLevel == 0){
        playerLevel = 1;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 2000 && playerLevel == 1){
        playerLevel = 2;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 4000 && playerLevel == 2){
        playerLevel = 3;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 8000 && playerLevel == 3){
        playerLevel = 4;
        Fight.playerHP = Fight.playerHP +10;
    }
    else if(GameState.xp >= 16000 && playerLevel == 4){
        playerLevel = 5;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 32000 && playerLevel == 5){
        playerLevel = 6;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 64000 && playerLevel == 6){
        playerLevel = 7;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 128000){
        playerLevel = 8;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 256000 && playerLevel == 8){
        playerLevel = 9;
        Fight.playerHP = Fight.playerHP + 10;
    }
    else if(GameState.xp >= 512000 && playerLevel == 9){
        playerLevel = 10;
        Fight.playerHP = Fight.playerHP + 10;
    }
}
}
