package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Drinksstorage {

    public static void startDrinksstorrage() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music drinksstorageMusic = new Music();
        drinksstorageMusic.run("drinksstorageMusic");

        System.out.println("\nDu befindest dich im Getränkelager. Rechts befindet sich der Glaskasten [rechts gehen]," +
                "\n links befindet sich der Aufzug [links gehen] und geradeaus befindet sich der Aufzug [vor gehen]\n");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.DRINKSSTORRAGE;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Der gesammte Raum sieht aus als ob er geplündert wurde. Überall liegen leere " +
                            "Kästen herum. In einer Ecke bewegt sich etwas [untersuchen]");

                    break;

                case "rechts gehen":
                    Fishtank.startFishtank();
                    break;
                case "untersuchen":
                    System.out.println("Eine wunderschöne aber zugleich groteske Kreatur greift dich an");
                    Fight fight = new Fight();
                    fight.kampf("dieGetränkenixe");

                case "vor gehen":
                    Kitchen.startKitchen();
                    break;
                case "links gehen":
                    Elevator.startElevator();
                    break;
                case "durchsuchen":
                    System.out.println("\nDu durchsuchst alle Kästen und findest tatsächlich noch eine flasche Spezi \uD83C\uDF7E");
                    System.out.println("Willst du sie mitnehmen? [ja] [nein]");
                    String yesNo = scanner.nextLine();
                    if (yesNo.equals("ja")) {
                        System.out.println("Du nimmst die Spezi mit");
                        GameState.currentItems[2] = "🍾";
                        Leben.statusLeiste();
                    } else {
                        System.out.println("Du lässt die Spezi liegen");
                    }
                    break;
                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}