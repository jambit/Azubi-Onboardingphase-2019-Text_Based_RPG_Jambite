package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Basement {

    public static void startBasement() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music basementMusic = new Music();
        basementMusic.run("basementMusic");

        System.out.println("        __..---'''---...___\n" +
                "              .'                   '.\n" +
                "             | .-------------------. |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             | |                   | |\n" +
                "             |_|___________________|_|\n");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.BASEMENT;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;

                case "Tastenfeld bedienen":

                    break;

                case "teleportieren":

                    if (GameState.currentItems[3].equals("\uD83D\uDD0B")) {
                        System.out.println("\ndu setzt die glühende Batterie vorichtig ein und drückst auf den grünen" +
                                " Knopf");
                        Thread.sleep(80);
                        System.out.println("charging system");
                        Thread.sleep(80);
                        System.out.print(" .");
                        Thread.sleep(80);
                        System.out.print(" .");
                        Thread.sleep(80);
                        System.out.print(" .");
                        Thread.sleep(80);
                        System.out.print(" .");
                        Thread.sleep(80);
                        System.out.print(" .");
                        System.out.println("set location:");

                        System.out.println("[aufzug],[tavorraum],[gang1],[sumatra],[küche],[gang2],[hr]," +
                                "[treppenhaus],[markusplatz],[glaskasten],[getränkelager],[kickerraum],[dach],[edeka]");

                        String tpRaum = scanner.nextLine();
                        switch (tpRaum) {
                            case "aufzug":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");
                                Thread.sleep(1000);
                                Elevator.startElevator();
                                break;
                            case "tavorraum":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                TApreroom.startTAPreroom();
                                break;
                            case "gang1":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Corridor1.startCorridor1();
                                break;
                            case "sumatra":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Sumatra.startSumatra();
                                break;
                            case "küche":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Kitchen.startKitchen();
                                break;
                            case "gang2":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Corridor2.startCorridor2();
                                break;
                            case "hr":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                HR.startHR();
                                break;
                            case "treppenhaus":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Stairs.startStairs();
                                break;
                            case "markusplatz":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Markusplatz.startMarkusplatz();
                                break;
                            case "getränkelager":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Drinksstorage.startDrinksstorrage();
                                break;
                            case "glaskasten":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Fishtank.startFishtank();
                                break;
                            case "kickerraum:":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Kickerroom.startKickerroom();
                                break;
                            case "keller":
                                System.out.println("du siehst wie sich ein Körper auf der anderen Seite des Raumes " +
                                        "zusammensetzt");
                                Thread.sleep(1000);
                                System.out.println("als sich die Person umdreht erzennst du dich selber wieder " +
                                        "und bist mindestens genauso geschockt wie dein gegenüber.");
                                Thread.sleep(1000);
                                System.out.println("Allerdings erholt sich dein Spiegelbild schneller vom Schock und " +
                                        "greift nach einem schweren\n " +
                                        "Schraubenschlüssel und geht damit auf dich los");
                                Thread.sleep(1000);
                                System.out.println("du spürst einen stechenden Schmerz am Kopf, bevor dir schwarz " +
                                        "vor Augen wird bemerkst du noch wie du am Bein aus dem Zimmer geschleift wirst");
                                GameState.liveCount = 0;
                                Leben.showLives(0);
                                GameStart start = new GameStart();
                                start.run();
                                break;
                            case "dach":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Roof.startRoof();
                                break;
                            case "edeka":
                                System.out.println("du spürst wie sich dein Körper demateralisiert und an einem " +
                                        "andern Ort wieder zusammensetzt");

                                Thread.sleep(1000);
                                Edeka.startEdeka();
                                break;
                            default:
                                RoomsOptions.normalRoomOptions(input);
                                break;

                        }
                    }
            }
        }
    }
}