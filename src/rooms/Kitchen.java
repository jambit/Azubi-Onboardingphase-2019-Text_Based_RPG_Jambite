package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Kitchen {

    public static void startKitchen() throws Exception {

        Music.sequencer.stop();
        //TODO add music
        Music kitchenMusic = new Music();
        kitchenMusic.run("kitchenMusic");
        System.out.println("\nDu befindest dich in der Küche!");

        boolean inRoom = true;
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.KITCHEN;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {

                case "umsehen":
                    System.out.println("Bis auf die tür durch du gerade kamst scheint es nur einen anderen Weg aus diesem raum zu geben.");
                    System.out.println("[rechts gehen]");
                    System.out.println("Jeder einzelne Zentimeter dieses Raumes scheint mit dreckigem Geschirr belegt zu sein.");
                    Thread.sleep(2000);
                    System.out.println("Aus einer Apparatur, die an der Spülmaschine hängt sprühen Funken.");
                    Thread.sleep(2000);
                    if (GameState.kitchenSearched == false) {
                        System.out.println("\nDie Wände sind voller Schränke [durchsuchen]");
                        Thread.sleep(2000);
                    }
                    if (GameState.currentItems[1].equals("⍰")) {
                        System.out.println("\nDesweiteren erkennst du die von hunderten Tassen verdeckte Kaffeemaschine.");
                        Thread.sleep(2000);
                        System.out.println("Benutze [kaffee holen] um dir einen Kaffee zu zubereiten.");
                    }
                    break;

                case "durchsuchen":
                    if(GameState.kitchenSearched == false){
                        System.out.println("Du durchsuchst sämtliche Schränke und findest: \n{2 Heiltränke}!");
                        Integer zahl = Bag.tasche.get("Heiltrank");
                        Bag.tasche.replace("Heiltrank", zahl + 2);

                        GameState.kitchenSearched = true;
                        Thread.sleep(2000);
                    }
                    break;
                case "kaffee holen":
                    if (GameState.currentItems[1] == "⍰"){
                        System.out.println("Nach einigen Minuten des Rumprobierens gelingt es dir der Maschine eine Tasse ");
                        Thread.sleep(2000);
                        System.out.println("kochend heißem Kaffee zu entlocken!");
                        GameState.currentItems[1] = "☕";
                        Thread.sleep(2000);
                    }
                    else {
                        System.out.println("Deine Taschen sind bereits Randvoll mit Kaffee.");
                    }
                    break;

                case "rechts gehen":
                    Drinksstorage.startDrinksstorrage();
                    break;

                case "links gehen":
                    Corridor1.startCorridor1();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}


