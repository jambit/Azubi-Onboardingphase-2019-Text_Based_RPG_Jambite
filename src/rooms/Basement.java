package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Basement {

    public static void startBasement() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music basementMusic = new Music();
        basementMusic.run("basementMusic");
        boolean inRoom = true;

//        while (inRoom) {
//            Constants.whereAmI = Constants.BASEMENT;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {

            case "umsehen":

                break;

            case "Tastenfeld bedienen":

                break;

            case "teleportieren":

                if (GameState.currentItems[3] == "\uD83D\uDD0B") {

//                    public static void tp() throws Exception {
//                    while (true) {
//                        System.out.println("Scnellreise:");
                    String tpRaum = scanner.nextLine();
                    switch (tpRaum) {
                        case "aufzug":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Elevator.startElevator();
                            break;
                        case "tavorraum":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            TApreroom.startTAPreroom();
                            break;
                        case "gang1":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Corridor1.startCorridor1();
                            break;
                        case "sumatra":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Sumatra.startSumatra();
                            break;
                        case "küche":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Kitchen.startKitchen();
                            break;
                        case "gang2":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Corridor2.startCorridor2();
                            break;
                        case "hr":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            HR.startHR();
                            break;
                        case "treppenhaus":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Stairs.startStairs();
                            break;
                        case "markusplatz":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Markusplatz.startMarkusplatz();
                            break;
                        case "getränkelager":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Drinksstorage.startDrinksstorrage();
                            break;
                        case "glaskasten":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Fishtank.startFishtank();
                            break;
                        case "kickerraum:":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Kickerroom.startKickerroom();
                            break;
                        case "keller":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Basement.startBasement();
                            break;
                        case "dach":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
                            Thread.sleep(1000);
                            Roof.startRoof();
                            break;
                        case "edeka":
                            System.out.println("du spürst wie sich dein Körper demateralisiert");
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