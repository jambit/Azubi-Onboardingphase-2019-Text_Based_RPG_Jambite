package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Edeka {

    public static void startEdeka() throws Exception {

        Music.sequencer.stop();
        Music edekaMusic = new Music();
        edekaMusic.run("edekaMusic");

        System.out.println("\nDu befindest dich im Edeka");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.EDEKA;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Rechts befindet sich die Straße");
                    break;

                case "rechts gehen":
                    Street.startStreet();
                    break;


                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}