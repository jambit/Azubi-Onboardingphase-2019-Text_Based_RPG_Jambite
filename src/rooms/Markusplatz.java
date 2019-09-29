package rooms;

import com.jambit.*;

import java.util.Scanner;

public class Markusplatz {

    public static void startMarkusplatz() throws Exception {

        Music.sequencer.stop();
        //TODO add music!
        Music markusplatzMusic = new Music();
        markusplatzMusic.run("markusplatzMusic");

        boolean inRoom = true;
        while (inRoom) {
            GameState.whereAmI = Constants.MARKUSPLATZ;
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Fight kampf = new Fight();
            Weapons waffen = new Weapons();
            switch (input) {

                case "umsehen":
                    System.out.println("Es führt ein gang nach links und einer nach rechts.\n");
                    if (GameState.printerIsDead == false) {
                        Thread.sleep(1000);
                        System.out.println("Zunächst fällt dir nichts weiter auf doch bei genauerem hinsehen entdeckst du einige ");
                        System.out.println("verdächtige Tinten Spuren, die allesamt zum Drucker zu führen scheinen.");
                        Thread.sleep(1000);
                        System.out.println("[spuren untersuchen]");
                        Thread.sleep(1000);
                    }
                    if (!Weapons.foundWeapons.contains("kugelschreiber")){
                        System.out.println("\n Desweiteren bemerkst du in einer der Ecken ein leichtes silbernes glitzern.");
                        Thread.sleep(1000);
                        System.out.println("[glitzern untersuchen]");
                        Thread.sleep(1000);
                    }
                    if (Weapons.foundWeapons.contains("kugelschreiber") && GameState.printerIsDead == true){
                        System.out.println("Du bermerkst weiter nichts besonderes.");
                        Thread.sleep(1000);
                    }

                    break;
                case "spuren untersuchen":
                    if (GameState.printerIsDead == false){
                        System.out.println("Während du dich langsam auf den Drucker zu bewegst hörst du ein leises Grummeln, ");
                        Thread.sleep(1000);
                        System.out.println("das immer lauter zu werden scheint.");
                        Thread.sleep(1000);
                        System.out.println("Plötzlich, als du schon fast vor ihm stehst, macht er einen einen kleinen Sprung nach vorne ");
                        Thread.sleep(1000);
                        System.out.println("und greift dich an.\n");
                        Thread.sleep(1000);
                        kampf.kampf("drucker");
                    }
                    else{
                        System.out.println("Viel toter scheint der Drucker nicht zu werden.");
                    }
                    break;
                case "glitzern untersuchen":
                    if(GameState.printerIsDead == false){
                        System.out.println("Als du dich näher auf das Glitzern zu bewegen willst, dreht sich der Drucker in deine Richtung ");
                        System.out.println("und greift dich an.\n");
                        kampf.kampf("drucker");
                    }
                    if(GameState.printerIsDead == true){
                        System.out.println("Du bewegst dich auf das glitzernde Objekt zu.");
                        System.out.println("Es stellt sich heraus das das glitzern von einem alten Schreibobjekt aus längst vergessenen Zeiten ausgeht.");
                        System.out.println("Der Stift trägt die Inschrift \"Jambit\".");
                        System.out.println("Du hebst ihn auf. Dir erscheint es als ob eine große Macht von ihm ausgeht.");
                        Weapons.weaponFound("kugelschreiber");
                        System.out.println("Möchtest du ihn ausrüsten?");
                        System.out.println("[ja]/[nein]");
                        String choice = scanner.nextLine();
                        if(choice.equals("ja")){
                            Weapons.currentWeapon = "kugelschreiber";
                            waffen.switchWeapon();
                        }
                        else{
                            break;
                        }
                    }
                    break;

                case "rechts gehen":

                    break;

                case "links gehen":
                    Stairs.startStairs();
                    break;

                case "zurück gehen":
                    Corridor1.startCorridor1();
                    break;

                default:
                    RoomsOptions.normalRoomOptions(input);
                    break;
            }
        }
    }
}