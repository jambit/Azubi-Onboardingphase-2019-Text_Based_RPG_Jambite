package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Stairs {

    public static void startStairs() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music stairsMusic = new Music();
        stairsMusic.run("stairsMusic");

        System.out.println(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,\n" +
                " 8                           8\"b,    \"Ya\n" +
                " 8                           8  \"b,    \"Ya\n" +
                " 8                    aaaaaaa8,   \"b,    \"Ya\n" +
                " 8                    8\"b,    \"Ya   \"8\"\"\"\"\"\"8\n" +
                " 8                    8  \"b,    \"Ya  8      8\n" +
                " 8             aaaaaaa8,   \"b,    \"Ya8      8\n" +
                " 8   A         8\"b,    \"Ya   \"8\"\"\"\"\"\"\"      8\n" +
                " 8             8  \"b,    \"Ya  8             8\n" +
                " 8      aaaaaa88,   \"b,    \"Ya8         B   8\n" +
                " 8      8\"b,    \"Ya   \"8\"\"\"\"\"\"\"             8\n" +
                " 8      8  \"b,    \"Ya  8                    8\n" +
                " 8aaaaaa8,   \"b,    \"Ya8                    8\n" +
                " 8\"b,    \"Ya   \"8\"\"\"\"\"\"\"                    8\n" +
                " 8  \"b,    \"Ya  8                           8\n" +
                " 8,   \"b,    \"Ya8                           8\n" +
                "  \"Ya   \"8\"\"\"\"\"\"\"                           8\n" +
                "    \"Ya  8                                  8\n" +
                "      \"Ya8          Normand Veilleux        8\n" +
                "        \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\n");
        System.out.println("\nDu befindest dich im Treppenhaus");
        System.out.printf("Rechts befindet sich der Gang aus dem du gerade kamst [rechts gehen]");
        System.out.printf("Links befindet sich die HR Abteilung [links gehen]");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.STARIS;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("");

                    break;
                case "runter gehen":
                    Corridor2.startCorridor2();
                    double randomNumber = Math.random();
                    if (randomNumber < 0.5) {
                        System.out.printf("");
                        System.out.printf("als du auf die erste Stufe trittst löst sich diese und dein Bein wird " +
                                "eingeklemmt.\nDie Stufe die sich gelöst hat faltet sich zu ein angsteiflößenden Gebilde zusammen und greit dich an.");
                        Fight fight = new Fight();
                        fight.kampf("dieLooseStufe");
                    }
                    break;

                case "rechts gehen":
                    Corridor1.startCorridor1();
                    break;

                case "links gehen":
                    HR.startHR();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}