package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Sumatra {

    public static void startSumatra() throws Exception {
        Music.sequencer.stop();
        //TODO add music

        System.out.println("\n" +
                "    \n" +
                "\n" +
                "                    _______________  _______________\n" +
                "                 .'               .'               .|\n" +
                "               .'               .'               .' |\n" +
                "             .'_______________.'______________ .'   |\n" +
                "             | ___ _____ ___ || ___ _____ ___ |     |\n" +
                "             ||_=_|__=__|_=_||||_=_|__=__|_=_||     |\n" +
                "       ______||_____===_____||||_____===_____||     | __________\n" +
                "    .'       ||_____===_____||||_____===_____||    .'          .'|\n" +
                "  .'         ||_____===_____||||_____===_____||  .'          .'  |\n" +
                ".'___________|_______________||_______________|.'__________.'    |\n" +
                "|.----------.|.-----___-----.||.-----___-----.||    |_____.----------.\n" +
                "|]          |||_____________||||_____________|||  .'      [          |\n" +
                "||          ||.-----___-----.||.-----___-----.||.'        |          |\n" +
                "||          |||_____________||||_____________|||==========|          |\n" +
                "||          ||.-----___-----.||.-----___-----.||    |_____|          |\n" +
                "|]         o|||_____________||||_____________|||  .'      [        'o|\n" +
                "||          ||.-----___-----.||.-----___-----.||.'        |          |\n" +
                "||          |||             ||||_____________|||==========|          |\n" +
                "||          |||             |||.-----___-----.||    |_____|          |\n" +
                "|]          |||             ||||             |||  .'      [          |\n" +
                "||__________|||_____________||||_____________|||.'________|__________|\n" +
                "''----------'''------------------------------'''----------''\n" +
                "\n");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        System.out.println();
        System.out.println("Du befindest dich im Raum Sumatra\n" +
                "rechts befindet sich der TA Vorraum [rechts gehen]");
        System.out.println();
        while (inRoom) {
            GameState.whereAmI = Constants.SUMATRA;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "umsehen":
                    System.out.println("der Raum Sumatra sieht aus wie ein großer Meetingraum. Am hinteren Ende des " + "\n" +
                            "langen Tisches lugt ein Kabelstrang hervor der sich bewegt [untersuchen]\n rechts hinter " +
                            "dir Befindet sich die Tür duch die du hereingekommen bist \nund auf der linken Seite " +
                            "befindet " +
                            "sich ein kleiner Schrank [durchsuchen]");
                    System.out.println();
                    break;
                case "untersuchen":
                    System.out.println("als du unter den Tisch blickst entdeckst du eine Kreatur die sich an den Kabeln" +
                            " laabt und wie es scheint Selbsgespräche führt");
                    Dialog.adalbert();
                    Fight adalbert = new Fight();
                    adalbert.kampf("adal");
                    break;
                case "durchsuchen":

                    //TODO füge ein Item das man finden kann hinzu

                    System.out.println("du findest einen ");
                    break;

                case "rechts gehen":
                   TApreroom.startTAPreroom();
                    break;
                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}
