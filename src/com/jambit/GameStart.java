package com.jambit;

import rooms.Elevator;

import java.io.IOException;
import java.util.Scanner;

public class GameStart {
    public void run() throws Exception {
        Intro intro = new Intro();
        intro.intro();
        intro.anleitung();

        setStats();

        Functions.newPage();

        Elevator elevator = new Elevator();
        elevator.startElevator();

        /*
        Rooms aufzug = new Rooms();
        aufzug.startAufzug();
         */
    }


    public static void setStats() throws InterruptedException, IOException {
        Weapons.weaponFound("faust");
        Weapons.currentWeapon = "faust";
        Weapons waffen = new Weapons();
        waffen.switchWeapon();
        Bag.tasche.put("Heiltrank", 0);
        System.out.println("Willkommen in der Welt von Jambite: \"Ein bissiges Abenteuer\"!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(1500);
        Scanner eingabe = new Scanner(System.in);
        System.out.println("\nGeb einen Namen ein: ");
        GameState.name = eingabe.nextLine();


        System.out.println("Wähle eine Schwierigkeit:");
        System.out.println("leicht    normal    hardcore");
        GameState.difficulty = eingabe.next();
        System.out.println("\nHerzlich Willkommen " + GameState.name + "\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(1500);
        Music.sequencer.stop();
        switch (GameState.difficulty) {
            case "leicht":
                GameState.liveCount = 3;
                Integer zahl1 = Bag.tasche.get("Heiltrank");
                Bag.tasche.replace("Heiltrank", zahl1 + 2);
                break;
            case "normal":
                GameState.liveCount = 2;
                Integer zahl2 = Bag.tasche.get("Heiltrank");
                Bag.tasche.replace("Heiltrank", zahl2 + 1);
                break;
            case "hardcore":
                GameState.liveCount = 1;
                break;
            default:
                GameState.liveCount = 0;
                Leben.showLives(0);
                break;
        }
    }
}
