package rooms;

import com.jambit.*;
import highscore.SaveGame;

import java.util.Scanner;

public class Roof {

    public static void startRoof() throws Exception {

        Music.sequencer.stop();
        //TODO add music!
        Music roofMusic = new Music();
        roofMusic.run("roofMusic");

        System.out.println("Du befindest dich auf dem Dach. Es gibt kein Geländer also solltest du aufpassen nicht zu" +
                "  \"stolpern\". ");


        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.ROOF;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("\n in der Mitte des Daches steht ein Hubschrauber mit dem du dem Alptraum " +
                            "entfliehen Könntest [get to the choppa]");
                    System.out.println("Der Stromschalter befindet sich gleich hinter der Tür [anschalten]");
                    break;

                case "springen":
                    System.out.println("du siehst wie die Stockwerke und dein Leben an dir vorbeirauschen und " +
                            "bereitest dich geistig auf den Aufprall vor");
                    Thread.sleep(500);
                    GameState.liveCount = 0;
                    Leben.showLives(0);
                    break;
                case "anschalten":
                    GameState.powerIsON = true;

                case "stolpern":
                    System.out.println("du siehst wie die Stockwerke und dein Leben an dir vorbeirauschen und " +
                            "bereitest dich geistig auf den Aufprall vor");
                    Thread.sleep(500);
                    GameState.liveCount = 0;
                    Leben.showLives(0);
                    break;

                case "links gehen":
                    Stairs.startStairs();
                    break;

                case "get to the choppa":
                    System.out.println("\n" +
                            "▬▬▬.◙.▬▬▬\n" +
                            "═▂▄▄▓▄▄▂\n" +
                            "◢◤ █▀▀████▄▄▄▄◢◤      \n" +
                            "█▄ █ーJ ███▀▀▀▀▀▀▀╬ ");
                    System.out.println("Du steigst in den Hubschrauber ein und entkommst dem Albtraum");
                    Thread.sleep(1500);
                    System.out.println();
                    SaveGame.winTheGame();

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}