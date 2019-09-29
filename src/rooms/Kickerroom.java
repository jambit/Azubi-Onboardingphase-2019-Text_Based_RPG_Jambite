package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Kickerroom {

    public static void startKickerroom() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music kickerroomMusic = new Music();
        kickerroomMusic.run("fishtankMusic");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.KICKERROOM;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Am hintersten Kickertisch stehen vier Kreaturen über den Tisch gebeugt, ");
                    System.out.println("sie scheinen sich sehr auf ihr Spiel zu konzentrieren.");
                    System.out.println("Es scheint nicht sehr ratsam sie zu [unterbrechen].");
                    break;
                case "unterbrechen":
                    System.out.println("Sämtliche");
                    Fight kampf = new Fight();
                    kampf.kampf("kicker");
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