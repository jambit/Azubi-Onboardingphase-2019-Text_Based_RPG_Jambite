package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Markusplatz {

    public static void startMarkusplatz() throws Exception {

        Music.sequencer.stop();
        //TODO add music!
        Music markusplatzMusic = new Music();
        markusplatzMusic.run("markusplatzMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.ELEVATOR;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Es führt ein gang nach links und einer nach rechts.");
                    if (GameState.printerIsDead == false) {
                        System.out.println("Zunächst fällt dir nichts weiter auf doch bei genauerem hinsehen entdeckst du einige");
                        System.out.println("verdächtige Tinten Spuren, die allesamt zum Drucker zu führen scheinen.");
                        System.out.println("[spuren untersuchen]");
                    }
                    if (!Weapons.foundWeapons.contains("kugelschreiber")){
                        System.out.println("\n Desweiteren bemerkst du in einer der Ecken ein leichtes silbernes glitzern.");
                        System.out.println("[glitzern untersuchen]");
                    }
                    if (Weapons.foundWeapons.contains("kugelschreiber") && GameState.printerIsDead == true){
                        System.out.println("Du bermerkst weiter nichts besonderes.");
                    }

                    break;

                case "rechts gehen":

                    break;

                case "links gehen":
                    Stairs.startStairs();
                    break;

                case "zurück gehen":
                    Corridor1.startCorridor1();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}