package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Fishtank {

    public static void startFishtank() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music fishtankMusic = new Music();
        fishtankMusic.run("fishatankMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.FISHTANK;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;

                case "rechts gehen":
                    Drinksstorage.startDrinksstorrage();
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