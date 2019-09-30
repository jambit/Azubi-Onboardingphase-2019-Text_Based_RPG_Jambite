package rooms;

import com.jambit.*;
import highscore.SaveGame;

import java.util.Scanner;

public class Street {

    public static void startStreet() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music streetMusic = new Music();
//        fishtankMusic.run("fishatankMusic");

        System.out.println("\n                                                          ______________\n" +
                "                                                         |##############\n" +
                "              __             __                          |##############\n" +
                "_____________|  |_____     _(   )                        |##############\n" +
                "UUUUUUUUUUUUU|__|UUUUU| ,-'      )_                      |##############\n" +
                "UUU_UUUUUU_UUUUUU_UUUU|(   (  /    )                     |   __   __   _\n" +
                "UU|_|UUUU|_|UUUU|_|UUU|.  \\   )  _) )                    |  |  | |  | | \n" +
                "UUUUUUUUUUUUUUUUUUUUUU| `.  .    )  )                    |  |__| |__| |_\n" +
                "======================|(_   |  )  _)                     |\n" +
                "     __     __    __  |(__(_|____)_______________________|   __   __   _\n" +
                "|   |__|   |__|  |__| |uuuuuuuuuuuuuuuuuuuuuuuuuuuu,'.uuu|  |  | |  | | \n" +
                "|   |__|   |__|  |__| |uuuuuuuuuuuuuuuuuuuuuuuuuu,'   `.u|  |__| |__| |_\n" +
                "======================|uuuu_uuuuuu_uuuuuu_uuuuu,'__   __`.\n" +
                "     __     __    __  |uuu| |uuuu| |uuuu| |uuuu||  | |  ||   __   __   _\n" +
                "|   |__|   |__|  |__| |uuu|_|uuuu|_|uuuu|_|uuuu||__| |__||  |  | |  | | \n" +
                "|   |__|   |__|  |__| |=_====__================'         |  |__| |__| |_\n" +
                "======================||  | |  |  __   __   __   __   __ |______________\n" +
                "  ___  __    ________ ||__| |__| |  | |  | |  | |  | |  ||+++++++++++++_\n" +
                "||_|_||  |  |  |     || _______  |__| |__| |__| |__| |__||++.-------.+| \n" +
                "||_|_||- |  | -|     |||   |   |                         |++|   |   |+|_\n" +
                " |_|_||  |  |  |_____|||   |o  |  _     ____________  _  |++|   |-  |+++\n" +
                "---. _|--|__|--|_____|||===|   |_|_|_  /_|__|_______| _|_|++|___|___|+++\n" +
                "----`. ___             ;---'---'      |  |_-|       |__     |       \\   \n" +
                "--(_)-'_ _\\___________/________|____/_'-(_)-----(_)-' _\\____|________\\__\n" +
                "jrei____________________________________________________________________");

        System.out.println("\nDu befindest dich auf der Straße.");
        System.out.println("Vor dir befindet sich der Edeka [vor gehen]");


        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.STREET;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Mitten auf befindet sich ein Auto,bei dem der Motor läuft und die Fahrertür offensteht.\n" +
                            " Mit dem Auto könntest du dem Alptraum entfliehen [fliehen]");
                    break;

                case "vor gehen":
                    Edeka.startEdeka();
                    break;

                case "fliehen":
                    System.out.println("Du steigst in das Auto und drückst das Gaspedal durch und lässt den ganzen " +
                            "Alptraum hinter dir.");
                    SaveGame.winTheGame();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}