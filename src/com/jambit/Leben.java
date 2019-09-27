package com.jambit;

import highscore.SaveGame;

import java.io.IOException;
import java.util.Scanner;

public class Leben {
    public static int liveCount;
    public static int xp = 0;
    public static String[] currentItems = {"⍰", "⍰", "⍰", "⍰", "⍰", "⍰", "⍰", "⍰"};


    public void addLive() throws InterruptedException, IOException {
        GameState.liveCount = GameState.liveCount + 1;
        System.out.println();
        System.out.println("du hast ein Leben dazubekommen ");
        showLives(GameState.liveCount);
    }

    public void removeLive() throws InterruptedException, IOException {
        GameState.liveCount = GameState.liveCount - 1;
        System.out.println();
        System.out.println("du hast ein Leben verloren");
        showLives(GameState.liveCount);

    }

    public static void checkLive() {
        switch (GameState.liveCount) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("");
                break;
        }
    }

    public static int calculateLives() {
        int currrentLives;
        return GameState.liveCount;
    }

    public static String showLives(int liveCount) throws InterruptedException, IOException {
        String lives = "";
        switch (liveCount) {
            case 0:

                System.out.println(" ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" +
                        "██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" +
                        "██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" +
                        "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" +
                        "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" +
                        " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
                Thread.sleep(1000);
                System.out.println("your highscore is " + GameState.xp);
                Thread.sleep(5000);
                System.out.println("do you want to see the local highscores? [yes] [no]");
                Scanner blah = new Scanner(System.in);
                String bluh = blah.nextLine();
                switch (bluh){
                    case "yes":
                        SaveGame.showHighscore();
                        break;

                    case "no":
                        System.exit(0);
                        break;

                    default:
                        break;
                }
                System.exit(0);

                break;
            case 1:
                lives = "❤  ♡  ♡";
                break;
            case 2:
                lives = "❤  ❤  ♡";
                break;
            case 3:
                lives = "❤  ❤  ❤";
                break;
            case 4:
                System.out.println();
                break;

            default:
                lives = "Error";
                break;
        }
        return lives;
    }

    public static String showXp(int xp) {
        String xPString = xp + " ";
        return xPString;
    }

    public static String showItems() {
        // ⍰ ⍰", "⛏", "☭", "☕", "\uD83D\uDD11", "⍰", "⍰", "⍰"};
        String items = GameState.currentItems[0] + "   " + GameState.currentItems[1] + "   " + GameState.currentItems[2] + "   " + GameState.currentItems[3] + "   " + GameState.currentItems[4] + "   " +
                GameState.currentItems[5] + "   " + GameState.currentItems[6] + "   " + GameState.currentItems[7];
        return items;
    }

    public static void statusLeiste() throws InterruptedException, IOException {

        if (GameState.liveCount > 0) {
            System.out.println("╔═══════════════╦══════════════════════════════════════════╦═══════════════╗");
        }
        System.out.println("║   " + showLives(GameState.liveCount) + "       " + showItems() + "         " + showXp(GameState.xp) + " XP ");
        System.out.println("╚═══════════════╩══════════════════════════════════════════╩═══════════════╝");
        System.out.println("");
    }
}
