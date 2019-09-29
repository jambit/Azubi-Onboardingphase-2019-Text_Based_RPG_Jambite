package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Street {

    public static void startStreet() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music streetMusic = new Music();
//        fishtankMusic.run("fishatankMusic");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.STREET;
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