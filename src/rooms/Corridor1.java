package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Corridor1 {

    public static void startCorridor1() throws Exception {
        Music.sequencer.stop();
        //TODO add music

        System.out.println("\n" + " _____________________________________________\n" +
                "|.'',                                     ,''.|\n" +
                "|.'.'',                                 ,''.'.|\n" +
                "|.'.'.'',                             ,''.'.'.|\n" +
                "|.'.'.'.'',                         ,''.'.'.'.|\n" +
                "|.'.'.'.'.|                         |.'.'.'.'.|\n" +
                "|.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n" +
                "|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n" +
                "|.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|\n" +
                "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "|,',',',',|---|',|'|???????|'|,'|---|,',',',',|\n" +
                "|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|\n" +
                "|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n" +
                "|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n" +
                "|.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|\n" +
                "|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n" +
                "|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n" +
                "|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n" +
                "|.','          /%%%%%%%%%%%%%%%\\          ','.|\n" +
                "|;____________/%%%%%%%%%%%%%%%%%\\____________;|");


        boolean inRoom = true;
        System.out.println();
        System.out.println("Ihr befindet euch im Gang1");
        System.out.println();
        System.out.println("Du siehtst einen langen Gang von dem rechts die Küche abzweigt [rechts gehen] \n" +
                "links vom Gang befindet sich der TA Vorraum [links gehen]\n" +
                "und am Ende des Ganges befindet sich der \"Markusplatz\" [vor gehen]");
        Cherry cherry = new Cherry();
        cherry.summonCherry();
        while (inRoom) {
            GameState.whereAmI = Constants.CORRIDOR1;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "rechts gehen":
                    Kitchen.startKitchen();
                    break;

                case "links gehen":
                    TApreroom.startTAPreroom();
                    break;

                case "vor gehen":
                    //TODO jump to Markusplatz
                    break;
                case "umsehen":
                    if (GameState.bageloserDead == false) {
                        System.out.println("\n" + "ein langer Gang von dem rechts die Küche abzweigt [rechts gehen] \n" +
                                "links vom Gang befindet sich der TA Vorraum [links gehen]\n" +
                                "und am Ende des Ganges befindet sich der \"Markusplatz\" [vor gehen]");
                        System.out.println("Am Ende des Ganges erblickst du einen verdächtigen Typen der sofort die Flucht ergreift" +
                                " [aufhalten]");
                    } else if (GameState.bageloserDead == true)
                        System.out.println("Ihr bemerkt weiter nichts auffälliges");
                    break;
                case "aufhalten":
                    if (GameState.bageloserDead == false) {
                        System.out.println("du hälst ihn auf und stellst ihn zur Rede");
                        System.out.println(GameState.name + ": warum rennst du weg?");
                        System.out.println("verdächtiger Typ \uD835\uDC60\uD835\uDC61\uD835\uDC5C\uD835\uDC61\uD835\uDC61" +
                                "\uD835\uDC52\uD835\uDC5F\uD835\uDC5B\uD835\uDC51: i i ich hab noch keine Schlüsselkarte " +
                                "bekommen");
                        System.out.println(GameState.name + "dann muss ich dich aus der gelben Zone rauswerfen [rauswerfen]");
                        Scanner rauswurf = new Scanner(System.in);
                        String kickOut = rauswurf.nextLine();
                        if (kickOut.equals("rauswerfen")) {
                            Fight kampf = new Fight();
                            kampf.kampf("badgeloser");
                        } else {
                            Functions.newPage();
                            System.out.println("du entäuschst jambit");
                            System.out.println("");
                            Leben.showLives(0);
                        }
                    }
                    break;
                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}
