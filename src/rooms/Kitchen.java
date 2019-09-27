package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Kitchen {

    public static void startKitchen() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music kitchenMusic = new Music();
        kitchenMusic.run("kitchenMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.ELEVATOR;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;

                case "rechts gehen":
                    Drinksstorage.startDrinksstorrage();
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


