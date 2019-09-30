package rooms;

import com.jambit.*;

import java.util.Scanner;

public class HR {

    public static void startHR() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music hRMusic = new Music();
        hRMusic.run("hRMusic");

        System.out.println("Du befindest dich in der HR Abteilung");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.HR;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Fight kampf = new Fight();
            switch (input) {

                case "umsehen":
                    System.out.println("Dieser Raum hat keinen weiteren ausgang.");
                    System.out.println("[zurück]");
                    Thread.sleep(2000);
                    System.out.println("\nBis auf einen Schrank scheint der Raum leer zu sein.");
                    System.out.println("[durchsuchen]");
                    Thread.sleep(2000);
                    break;
                case "zurück":
                    Stairs.startStairs();
                    break;
                case "durchsuchen":
                    if(GameState.spiderDead == false) {
                        System.out.println("Du öffnest die erste Schranktür und siehst {3 Heiltränke}.");
                        Thread.sleep(2000);
                        System.out.println("Du streckst deine Hand nach ihnen aus, ");
                        Thread.sleep(2000);
                        System.out.println("doch bevor du sie erreichen kannst fällt eine Spinne von der Decke, direkt auf deine Hand.");
                        kampf.kampf("spinne");
                    }
                    if(GameState.spiderDead == true && GameState.hrPotionsGot == false){
                        System.out.println("Du erhältst die {3 Heiltränke}");
                        Integer zahl = Bag.tasche.get("Heiltrank");
                        Bag.tasche.replace("Heiltrank", zahl + 3);
                    }
                    else{
                        System.out.println("Nichts zu sehen.");
                    }
                    break;

                case "links gehen":
                    Stairs.startStairs();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}