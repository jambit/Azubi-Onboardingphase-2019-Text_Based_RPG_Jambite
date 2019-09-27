package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Drinksstorage {

    public static void startDrinksstorrage() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music drinksstorageMusic = new Music();
        drinksstorageMusic.run("drinksstorageMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.DRINKSSTORRAGE;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":

                    break;

                case "rechts gehen":
                    Fishtank.startFishtank();
                    break;

                case "links gehen":
                    Kitchen.startKitchen();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}