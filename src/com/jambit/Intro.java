package com.jambit;

import java.io.IOException;

public class Intro {
    public void intro() throws Exception {

        Music musik = new Music();
        musik.run("intro");

        Thread.sleep(500);
        System.out.println(" ▄▄▄██▀▀▀    ▄▄▄          ███▄ ▄███▓    ▄▄▄▄       ██▓   ▄▄▄█████▓   ▓█████ ");
        Thread.sleep(500);
        System.out.println("   ▒██      ▒████▄       ▓██▒▀█▀ ██▒   ▓█████▄    ▓██▒   ▓  ██▒ ▓▒   ▓█   ▀ ");
        Thread.sleep(500);
        System.out.println("   ░██      ▒██  ▀█▄     ▓██    ▓██░   ▒██▒ ▄██   ▒██▒   ▒ ▓██░ ▒░   ▒███   ");
        Thread.sleep(500);
        System.out.println("▓██▄██▓     ░██▄▄▄▄██    ▒██    ▒██    ▒██░█▀     ░██░   ░ ▓██▓ ░    ▒▓█  ▄ ");
        Thread.sleep(500);
        System.out.println(" ▓███▒       ▓█   ▓██▒   ▒██▒   ░██▒   ░▓█  ▀█▓   ░██░     ▒██▒ ░    ░▒████▒");
        Thread.sleep(500);
        System.out.println(" ▒▓▒▒░       ▒▒   ▓▒█░   ░ ▒░   ░  ░   ░▒▓███▀▒   ░▓       ▒ ░░      ░░ ▒░ ░");
        Thread.sleep(700);
        System.out.println(" ▒ ░▒░        ▒   ▒▒ ░   ░  ░      ░   ▒░▒   ░     ▒ ░       ░        ░ ░  ░");
        Thread.sleep(700);
        System.out.println(" ░ ░ ░        ░   ▒      ░      ░       ░    ░     ▒ ░     ░            ░   ");
        Thread.sleep(700);
        System.out.println(" ░   ░            ░  ░          ░       ░          ░                    ░  ░");
        Thread.sleep(700);
        System.out.println("                                             ░                              ");
        System.out.println("                    Press enter to start the Game");
        System.in.read();

    }

    public void anleitung() throws InterruptedException, IOException {
        for (int i = 0; i <= 40; i++) {
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Gib \"help\" für hilfe ein.");
        System.out.println("");
        System.out.println("[umsehen] ist in jedem Raum eine große Hilfe um versteckte Gegenstände und Funktionen zu " +
                "entdecken");
        System.out.println("mit [\"richtung\" + gehen] kannst du in einen anliegenden Raum gehen\n");
        System.out.println("das Spielziel ist einen hohen Highscore zu erreichen und dann auf dem Dach oder der " +
                "\nStraße einen Evacuation Point zu erreichen und dem Alptraum zu entfliehen.");
        System.out.println();
        System.out.println("Press enter to continue");
        System.in.read();

    }
}
