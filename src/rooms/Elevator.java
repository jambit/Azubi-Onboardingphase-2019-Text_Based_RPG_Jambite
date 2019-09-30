package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Elevator {

    boolean firsttimeinelevator = true;

    public static void startElevator() throws Exception {

        Music.sequencer.stop();

        Music elevatorMusic = new Music();
        elevatorMusic.run("elevatorMusic");

        System.out.println(
                "                       / ▌ ³ ▌\\                  \n" +
                        "                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀            \n" +
                        "                  ▐▐       ▌      ▐▐             \n" +
                        "                  ▐▐       ▌      ▐▐              \n" +
                        "                  ▐▐       ▌      ▐▐         \n" +
                        "                  ▐▐       ▌      ▐▐        \n" +
                        "                  ▐▐       ▌      ▐▐         \n" +
                        "                  ▐▐       ▌      ▐▐      \n" +
                        "                  ▐▐       ▌      ▐▐              \n" +
                        "                  ▐▐       ▌      ▐▐              \n" +
                        "           ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ ");


        if (GameState.firstTimeInElevator = true) {
            System.out.println(
                    "════════════════════════════════════════════════════════════════════════════════════════════════════════════════════\n" +
                            "Als du erwachst fühlst du einen stechenden Schmerz am Kopf. Alles scheint sich zu " +
                            "drehen, \ndoch nach einigen Sekunden des Konzentrierens schafft du es " +
                            "aufzustehen.\n");
            GameState.firstTimeInElevator = false;
        }
        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.ELEVATOR;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Mit dem Aufzug fahen [0 Drücken] [B51]");
                    if (GameState.hatSichSchonInElevatorUmgesehen == true) {
                        System.out.println("du entdeckst in der linken Ecke des Aufzugs hinter dir eine Schlüsselkarte \n"
                                + "willst du sie mitnehmen?");
                        Scanner wantTo = new Scanner(System.in);
                        String willstDu = "nein";
                        willstDu = wantTo.nextLine();
                        if (willstDu.equals("ja")) {
                            GameState.currentItems[0] = "🔑";
                            System.out.println("die Schlüsselkarte 🔑 wurde deinem Inventar hinzugefügt");
                            System.out.println("");
                            Leben.statusLeiste();
                        } else {
                            System.out.println("du lässt die Schlüsselkarte in der Ecke liegen");
                        }

                    } else {
                        System.out.println("es führt eine Tür " +
                                "nach Links und eine nach Rechts");
                        GameState.hatSichSchonInElevatorUmgesehen = true;
                    }
                    break;

                case "rechts gehen":
                    if (GameState.currentItems[0] == "🔑") {
                        System.out.println("mit der Schlüsselkarte lässt sich die Tür öffnen und du gehst in den nächsten" +
                                " Raum");
                        TApreroom.startTAPreroom();
                    } else {
                        System.out.println("der Kartenleser der Tür verlangt nach einer Schlüsselkarte. \n" + "Vieleicht " +
                                "solltest du dich nochmal umsehen");
                    }
                    break;
                case "links gehen":
                    if (GameState.currentItems[0] == "🔑") {
                        System.out.println("mit der Schlüsselkarte lässt sich die Tür öffnen und du gehst in den nächsten" +
                                " Raum");
                        Drinksstorage.startDrinksstorrage();
                    } else {
                        System.out.println("der Kartenleser der Tür verlangt nach einer Schlüsselkarte. \n" + "Vieleicht " +
                                "solltest du dich nochmal umsehen");
                    }
                    break;

                case "0 drücken":
                    System.out.println("du drückst auf den Knopf");
                    if (GameState.powerIsON = true) {
                        System.out.println("der Aufzug fährt nach unten und du trittst auf die Straße hinaus");
                        Street.startStreet();
                    } else {
                        System.out.println("anscheinend hat der Aufzug noch keinen Strom (der Stromschalter befindet " +
                                "sich im zweiten Stock beim Kickerraum");
                    }
                    break;

                case "B51 drücken":
                    System.out.println("du drückst auf den Knopf");
                    if (GameState.powerIsON = true) {
                        System.out.println("zunächst passiert nichts doch dann beschleunigt der Aufzug rasant nach " +
                                "unten, " +
                                " nach etwa zwei Minuten öffnet sich die Tür und du trittst in eine riesige Halle");
                        Basement.startBasement();
                    }
                    break;
                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}
