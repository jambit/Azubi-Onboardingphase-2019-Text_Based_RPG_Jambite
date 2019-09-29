package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Corridor2 {

    public static void startCorridor2() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music corridor2Music = new Music();
        corridor2Music.run("corridor2Music");

        System.out.println("\n" + " _____________________________________________\n" +
                "|.'',                                     ,''.|\n" +
                "|.'.'',                                 ,''.'.|\n" +
                "|.'.'.'',                             ,''.'.'.|\n" +
                "|.'.'.'.'',                         ,''.'.'.'.|\n" +
                "|.'.'.'.'.'',                       |.'.'.'.'.|\n" +
                "|.'.'.'.'.'.'',                 ;===|.'.'.'.'.|\n" +
                "|.'.'.'.''.'.'.',             ,'|:::|.'.'.'.'.|\n" +
                "|.'.'.'.''.'.'.'.|, _______ ,|.'|---|.'.'.'.'.|\n" +
                "|.'.'.'.'.''.'.'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "|,',',',',',',','|'|???????|'|,'|---|,',',',',|\n" +
                "|.'.'.'.'.'.'.'.'|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "|.'.'.'.'.'.'.'.,'   /%%%\\  '|,'|---|.'.'.'.'.|\n" +
                "|.'.'.'.'.'.'.''    /%%%%%\\    '|===|.'.'.'.'.|\n" +
                "|.'.'.'.'.'.'      /%%%%%%%%%%%%%%%%|.'.'.'.'.|\n" +
                "|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n" +
                "|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n" +
                "|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n" +
                "|.','          /%%%%%%%%%%%%%%%\\          ','.|\n" +
                "|;____________/%%%%%%%%%%%%%%%%%\\____________.|");

        System.out.println("\nDu befindest dich im Gang2");
        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.CORRIDOR2;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Rechts befindet sich der Kickerraum [rechts gehen]");

                    break;

                case "rechts gehen":
                    Kickerroom.startKickerroom();
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