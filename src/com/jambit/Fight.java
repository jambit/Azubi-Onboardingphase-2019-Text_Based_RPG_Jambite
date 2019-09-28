package com.jambit;

import rooms.*;

import java.util.Random;
import java.util.Scanner;

public class Fight {


    Random r = new Random();
    public static int playerHP = 100;
    int inFightHP;


    Scanner kampfAuswahl = new Scanner(System.in);


    public void kampf(String gegnerWahl) throws Exception {
        inFightHP = playerHP;
        Enemies gegner = new Enemies();
        switch (gegnerWahl){
            case "tobi":
                gegner.tobi();
                intFight();
                break;
            case "drucker":
                gegner.printer();
                intFight();
                break;
            case "yannik":
                gegner.yannik();
                intFight();
                break;
            case "badgeloser":
                gegner.badgeloser();
                intFight();
                break;
            case "adal":
                gegner.adal();
                intFight();
                break;
            case "cherry":
                gegner.cherryHuman();
                intFight();
                break;
            case "kicker":
                gegner.kickermonster();
                intFight();
        }


    }


    void angriffe() throws Exception {


        while (true) {
            System.out.println("Gegner HP: " + Enemies.enemyHealth);
            System.out.println("Deine HP: " + inFightHP);
            System.out.println("\n[1]" + Enemies.quickAttack + "\n[2]" + Enemies.strongAttack + "\n[3]" + Enemies.attack3 + "\n[4]Zurück");
            System.out.println("Auswahl: ");
            int auswahl = kampfAuswahl.nextInt();

            if (auswahl == 1) {
                float chance = r.nextFloat();
                if (chance <= Weapons.playerHitChance1) {
                    Enemies.enemyHealth = Enemies.enemyHealth - Weapons.playerDamage1;
                    System.out.println("Getroffen\n");
                    if (Enemies.enemyHealth <= 0) {
                        System.out.println("Der Gegner geht zu Boden");
                        GameState.xp = GameState.xp + Enemies.xp;
                        LevelSystem.levelUp();
                        System.out.println("Dein Level: " + LevelSystem.playerLevel);
                        Music.sequencer.stop();
                        Thread.sleep(1000);
                        leaveFightWin();
                    }

                }
            } else {
                System.out.println("\nNicht Getroffen\n");
            }
            float chance1 = r.nextFloat();
            if (chance1 <= Enemies.trefferChance) {
                System.out.println("Der Gegner trifft");
                inFightHP = inFightHP - Enemies.gegnerSchaden;
                Thread.sleep(1000);
                if (inFightHP <= 0) {
                    System.out.println("Du gehst zu Boden");
                    Leben looseALive = new Leben();
                    looseALive.removeLive();
                    Thread.sleep(2000);
                    Music.sequencer.stop();
                    leaveFightLose();

                }
            } else {
                System.out.println("Der Gegner verfehlt\n");
            }


            if (auswahl == 2) {
                float chance = r.nextFloat();
                if (chance <= Weapons.playerHitChance2) {
                    Enemies.enemyHealth = Enemies.enemyHealth - Weapons.playerDamage2;
                    System.out.println("Getroffen\n");
                    if (Enemies.enemyHealth <= 0) {
                        System.out.println("Der Gegner geht zu Boden\n");
                        GameState.xp = GameState.xp + Enemies.xp;
                        LevelSystem.levelUp();
                        System.out.println("Dein Level: " + LevelSystem.playerLevel);
                        Music.sequencer.stop();
                        Thread.sleep(2000);
                        leaveFightWin();
                    }
                } else {
                    System.out.println("Nicht Getroffen\n");
                }

                float chance2 = r.nextFloat();
                if (chance2 <= Enemies.trefferChance) {
                    System.out.println("Der Gegner trifft\n");
                    inFightHP = inFightHP - Enemies.gegnerSchaden;
                } else {
                    System.out.println("Der Gegner verfehlt\n");
                }
            } else if (auswahl == 4) {
                fightSystem();
            }
        }
    }


    void intFight() throws Exception {
        float chance = r.nextFloat();
        Music musik = new Music();
        musik.run(Enemies.song);
        if (true) {
            System.out.println("Ein wildes " + Enemies.gegnerName + " greift an");
            Thread.sleep(1000);
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║   " + Enemies.klasse + Enemies.nameNeu + "║");
            System.out.println("╚══════════════════════════════════╝");
            Thread.sleep(500);

            System.out.println(Enemies.gegnerAscii);
            Thread.sleep(500);
            fightSystem();
        }
    }


    void fightSystem() throws Exception {

        System.out.println("\n[1]Angriff");
        Thread.sleep(500);
        System.out.println("[2]Gürtel");
        Thread.sleep(500);
        System.out.println("[3]Flucht");
        Thread.sleep(500);
        System.out.println("\nAuswahl: ");
        int auswahl = kampfAuswahl.nextInt();


        if (auswahl == 1) {
            angriffe();
        } else if (auswahl == 2) {
            guertelInFight();

        } else if (auswahl == 3) {
            float chance = r.nextFloat();
            if (chance <= 0.25f) {
                System.out.println("Erfolgreich entkommen!");
                Thread.sleep(2000);
                leaveFightLose();
            } else {
                System.out.println("\nFehlgeschlagen!");
                fightSystem();
            }


        }


    }

    void guertelInFight() throws Exception {
        System.out.println("\n[1]Ausrüstung");
        Thread.sleep(500);
        System.out.println("[2]Tränke");
        Thread.sleep(500);
        System.out.println("\nAuswahl: ");
        int wahlGürtel = kampfAuswahl.nextInt();
        if (wahlGürtel == 1) {
            System.out.println("\n[1]Waffen");
            Thread.sleep(500);
            System.out.println("[2]Rüstung");
            Thread.sleep(500);
            System.out.println("[3]Zurück");
            Thread.sleep(500);
            System.out.println("\nAuswahl: ");
            int wahlAusrüstung = kampfAuswahl.nextInt();
            if (wahlAusrüstung == 1) {
                Weapons waffen = new Weapons();

                System.out.println("\n[1]Aktuelle Waffe anzeigen");
                Thread.sleep(500);
                System.out.println("[2]Verfügbare Waffen anzeigen");
                Thread.sleep(500);
                System.out.println("\nAuswahl: ");
                int waffenMenu = kampfAuswahl.nextInt();
                if (waffenMenu == 1) {
                    System.out.println(Weapons.weaponName);
                    Thread.sleep(500);
                    System.out.println(Weapons.weaponAscii);
                    Thread.sleep(3000);
                    fightSystem();

                } else if (waffenMenu == 2) {
                    if (waffen.foundWeapons.contains("faust")) {

                        waffen.faust();
                        System.out.println(Weapons.weaponName);
                        System.out.println(Weapons.weaponAscii);
                        System.out.println("\n[1]Ausrüsten");

                    }
                    if (Weapons.foundWeapons.contains("kugelschreiber")) {
                        waffen.kugelschreiber();
                        System.out.println(Weapons.weaponName);
                        System.out.println(Weapons.weaponAscii);
                        System.out.println("\n[2]Ausrüsten");
                    }
                    System.out.println("\nAuswahl: ");
                    int chooseWeapon = kampfAuswahl.nextInt();


                    if (chooseWeapon == 1) {
                        Weapons.currentWeapon = "faust";
                        waffen.switchWeapon();
                        fightSystem();
                    } else if (chooseWeapon == 2) {
                        Weapons.currentWeapon = "kugelschreiber";
                        waffen.switchWeapon();
                        fightSystem();
                    }
                } else if (waffenMenu == 3) {
                    fightSystem();
                }
            } else if (wahlAusrüstung == 2) {

            }
        } else if (wahlGürtel == 2) {
            System.out.println("Heiltränke: " + Bag.tasche.get("Heiltrank"));
            Thread.sleep(500);
            System.out.println("\n[1]Trank trinken");
            Thread.sleep(500);
            System.out.println("[2]Zurück");
            Thread.sleep(500);
            System.out.println("\nAuswahl: ");
            int wählen = kampfAuswahl.nextInt();
            if (wählen == 1) {
                inFightHP = inFightHP + 25;
                Integer zahl = Bag.tasche.get("Heiltrank");
                Bag.tasche.replace("Heiltrank", zahl - 1);
                System.out.println("Aktuelle HP: " + inFightHP);
                Thread.sleep(500);
                fightSystem();
            } else if (wählen == 2) {
                fightSystem();
            }
        } else if (wahlGürtel == 1) {


        }
    }

    void guertelOutFight() throws Exception {

        System.out.println("\n[1]Waffen");
        Thread.sleep(500);
        System.out.println("[2]Zurück");
        Thread.sleep(500);
        System.out.println("\nAuswahl: ");
        int wahlAusrüstung = kampfAuswahl.nextInt();
        if (wahlAusrüstung == 1) {
            Weapons waffen = new Weapons();

            System.out.println("\n[1]Aktuelle Waffe anzeigen");
            Thread.sleep(500);
            System.out.println("[2]Verfügbare Waffen anzeigen");
            Thread.sleep(500);
            System.out.println("\nAuswahl: ");
            int waffenMenu = kampfAuswahl.nextInt();
            if (waffenMenu == 1) {
                System.out.println(Weapons.weaponName);
                Thread.sleep(500);
                System.out.println(Weapons.weaponAscii);
                Thread.sleep(3000);
                guertelOutFight();

            } else if (waffenMenu == 2) {
                if (waffen.foundWeapons.contains("faust")) {

                    waffen.faust();
                    System.out.println(Weapons.weaponName);
                    System.out.println(Weapons.weaponAscii);
                    System.out.println("\n[1]Ausrüsten");

                }
                if (Weapons.foundWeapons.contains("kugelschreiber")) {
                    waffen.kugelschreiber();
                    System.out.println(Weapons.weaponName);
                    System.out.println(Weapons.weaponAscii);
                    System.out.println("\n[2]Ausrüsten");
                }
                System.out.println("\nAuswahl: ");
                int chooseWeapon = kampfAuswahl.nextInt();


                if (chooseWeapon == 1) {
                    Weapons.currentWeapon = "faust";
                    waffen.switchWeapon();
                    guertelOutFight();
                } else if (chooseWeapon == 2) {
                    Weapons.currentWeapon = "kugelschreiber";
                    waffen.switchWeapon();
                    guertelOutFight();
                }
            } else if (waffenMenu == 3) {
                leaveFightLose();

            }
        } else if (wahlAusrüstung == 2) {
            leaveFightLose();

        }
    }

    void leaveFightWin() throws Exception {
        switch (GameState.whereAmI) {
            case "Sumatra":
                Sumatra.startSumatra();
                break;
            case "Kitchen":
                Kitchen.startKitchen();
                break;
            case "Corridor1":
                Corridor1.startCorridor1();
                GameState.bageloserDead = true;
                break;
            case "TApreroom":
                TApreroom.startTAPreroom();
                break;
            case "Elevator":
                Elevator elevator = new Elevator();
                elevator.startElevator();
                break;
            case "Fishtank":
                Fishtank.startFishtank();
                break;
            case "Corridor2":
                Corridor2.startCorridor2();
                break;
            case "Markusplatz":
                Markusplatz.startMarkusplatz();
                GameState.printerIsDead = true;
                break;
            case "HR":
                HR.startHR();
                break;
            case "Stairs":
                Stairs.startStairs();
                break;
            case "Drinksstorage":
                Drinksstorage.startDrinksstorrage();
                break;
            case "Basement":
                Basement.startBasement();
                break;
            case "Roof":
                Roof.startRoof();
                break;
            case "Street":
                Street.startStreet();
                break;
            case "Kickerroom":
                Kickerroom.startKickerroom();
                break;
            case "Edeka":
                Edeka.startEdeka();
                break;

        }
    }

    void leaveFightLose() throws Exception {
        switch (GameState.whereAmI) {
            case "Sumatra":
                Sumatra.startSumatra();
                Functions.newPage();
                break;
            case "Küche":
                Kitchen.startKitchen();
                Functions.newPage();
                break;
            case "Gang1":
                Corridor1.startCorridor1();
                Functions.newPage();
                break;
            case "TAVorraum":
                TApreroom.startTAPreroom();
                Functions.newPage();
                break;
            case "Aufzug":
                Elevator elevator = new Elevator();
                elevator.startElevator();
                Functions.newPage();
                break;
            case "Glaskasten":
                Fishtank.startFishtank();
                Functions.newPage();
                break;
            case "Gang2":
                Corridor2.startCorridor2();
                Functions.newPage();
                break;
            case "Markusplatz":
                Markusplatz.startMarkusplatz();
                Functions.newPage();
                break;
            case "HR":
                HR.startHR();
                Functions.newPage();
                break;
            case "Treppenhaus":
                Stairs.startStairs();
                Functions.newPage();
                break;
            case "Getränkelager":
                Drinksstorage.startDrinksstorrage();
                Functions.newPage();
                break;
            case "Keller":
                Basement.startBasement();
                Functions.newPage();
                break;
            case "Dach":
                Roof.startRoof();
                Functions.newPage();
                break;
            case "Straße":
                Street.startStreet();
                Functions.newPage();
                break;
            case "Kickerraum":
                Kickerroom.startKickerroom();
                Functions.newPage();
                break;
            case "Edeka":
                Edeka.startEdeka();
                Functions.newPage();
                break;

        }
    }
}
