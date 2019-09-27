package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Corridor2 {

    public static void startCorridor2() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music corridor2Music = new Music();
        corridor2Music.run("corridor2Music");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.DRINKSSTORRAGE;
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