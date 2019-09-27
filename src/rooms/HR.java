package rooms;

import com.jambit.*;

import java.util.Scanner;

public class HR {

    public static void startHR() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music hRMusic = new Music();
        hRMusic.run("hRMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.STARIS;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;
                case "runter gehen":

                    break;
                case "rechts gehen":

                    break;

                case "links gehen":

                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}