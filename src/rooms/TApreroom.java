package rooms;
import com.jambit.Cherry;
import com.jambit.Constants;
import com.jambit.GameState;
import com.jambit.RoomsOptions;
import java.util.Scanner;

public class TApreroom {
    public static void startTAPreroom() throws Exception {
        System.out.println("                                                 \n" +
                "                                                 \n" +
                "                    .@@@@@@,                     \n" +
                "                   %@@@@@@@@@                    \n" +
                "                   @@@@@@@@@@                    \n" +
                "                    @@@@@@@@                     \n" +
                "                       %%                        \n" +
                "                   @@@@@@@@@@.                   \n" +
                "                 *@@@@@@@@@@@@@                  \n" +
                "                @@@@@@@@@@@@@@@@                 \n" +
                "               @@@@@@@@@@@@@@@@@@/               \n" +
                "              @@@@*@@@@@@@@@@(,@@@@              \n" +
                "     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@            @@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@   jambit   @@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@            @@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       \n" +
                "       @                               @.        \n" +
                "       *                               *    ");
        System.out.println("");
        System.out.println("du befindest dich im TA Vorraum");
        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.TAPREROOM;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "rechts gehen":
                    System.out.println("du gehst in den Gang");
                    Corridor1 corridor1 = new Corridor1();
                    corridor1.startCorridor1();
                    break;
                case "links gehen":
                    System.out.println("du betrittst Sumatra");
                    Sumatra.startSumatra();
                    break;
                case "umsehen":
                    System.out.println("Der Raum links ist mit Sumatra beschriftet und nach Rechts führt ein langer Gang");
                    System.out.println("außerdem liegt ein Zettel auf dem Tresen [lesen] \n" +
                            "hinter dir ist der Aufzug [zurück gehen]");
                    break;

                case "lesen":
                    System.out.println(" __________________________  \n" +
                            "()_________________________)\n" +
                            " \\  ich suche meine Spinne  \\\n" +
                            "  \\               -Alma      \\\n" +
                            "   \\__________________________\\\n" +
                            "   ()__________________________)");

                    System.out.println("");
                case "zurück gehen":
                    Elevator.startElevator();
                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;

            }
        }
    }
}