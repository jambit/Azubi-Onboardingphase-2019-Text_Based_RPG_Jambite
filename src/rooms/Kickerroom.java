package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Kickerroom {

    public static void startKickerroom() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music kickerroomMusic = new Music();
        kickerroomMusic.run("fishatankMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.FISHTANK;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

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