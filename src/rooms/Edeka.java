package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Edeka {

    public static void startEdeka() throws Exception {

        Music.sequencer.stop();
        Music edekaMusic = new Music();
        edekaMusic.run("edekaMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.EDEKA;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;

                case "rechts gehen":

                    break;

                case "links gehen":
                    Corridor1.startCorridor1();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}