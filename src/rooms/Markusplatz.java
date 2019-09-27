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