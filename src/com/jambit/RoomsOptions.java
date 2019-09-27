package com.jambit;

import rooms.*;

import java.io.IOException;
import java.util.Scanner;

public class RoomsOptions {


    public static boolean hatSichSchonUmgesehen = false;
    public static boolean bageloserDead = false;
    public static boolean adalIsDead = false;
    public static boolean stromIstAn = false;

    public static void normalRoomOptions(String input) throws Exception {
        switch (input) {
            case "/add live":
                addLive();
            case "/tp":
                tp();
                break;
            case "/test fight":
                Fight test = new Fight();
                Enemies gegner = new Enemies();
                gegner.badgeloser();
                test.intFight();
            case "help":
                Help.help();
                break;
            case "inventar":
                showInventory();
                break;
            case "gürtel":
                Fight guertel = new Fight();
                guertel.guertelOutFight();
                break;
            case "/kill":
                GameState.liveCount = 0;
                Leben.showLives(0);
                break;
            case "/add xp":
                System.out.println();
                Functions.addXp();
            default:
                break;
        }
    }

    public static void tp() throws Exception {
        while (true) {
            System.out.println("Scnellreise:");
            Scanner scanner = new Scanner(System.in);
            String tpRaum = scanner.nextLine();
            switch (tpRaum) {
                case "aufzug":
                    Elevator.startElevator();
                    break;
                case "tavorraum":
                    TApreroom.startTAPreroom();
                    break;
                case "gang1":
                    Corridor1.startCorridor1();
                    break;
                case "sumatra":
                    Sumatra.startSumatra();
                    break;
                case "küche":
                    Kitchen.startKitchen();
                    break;
                case "gang2":
                    Corridor2.startCorridor2();
                    break;
                case "hr":
                    HR.startHR();
                    break;
                case "treppenhaus":
                    Stairs.startStairs();
                    break;
                case "markusplatz":
                    Markusplatz.startMarkusplatz();
                    break;
                case "getränkelager":
                    Drinksstorage.startDrinksstorrage();
                    break;
                case "glaskasten":
                    Fishtank.startFishtank();
                    break;
                case "kickerraum:":
                    Kickerroom.startKickerroom();
                    break;
                case "keller":
                    Basement.startBasement();
                    break;
                case "dach":
                    Roof.startRoof();
                    break;
                case "edeka":
                    Edeka.startEdeka();
                    break;
                default:
                    break;
            }
        }

    }

    public static void addLive() throws InterruptedException, IOException {
        GameState.liveCount = GameState.liveCount + 1;
        System.out.println("");
        System.out.println("+ ❤");
        System.out.println("");
        Leben.statusLeiste();
        System.out.println("");
    }

    public static void showInventory() throws InterruptedException, IOException {
        System.out.println("");
        Leben.statusLeiste();
        System.out.println("");
    }
}


