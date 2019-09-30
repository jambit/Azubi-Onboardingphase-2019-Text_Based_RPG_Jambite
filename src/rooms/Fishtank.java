package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Fishtank {

    public static void startFishtank() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music fishtankMusic = new Music();
        fishtankMusic.run("fishtankMusic");

        System.out.println("Du befindest dich im Glaskasten");
        System.out.println("Rechts befindet sich das Getränkelager und links der Markusplatz");
        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
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
                    Markusplatz.startMarkusplatz();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}