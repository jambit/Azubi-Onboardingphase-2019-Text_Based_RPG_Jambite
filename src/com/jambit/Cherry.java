package com.jambit;

import java.util.Random;
import java.util.Scanner;

public class Cherry {
    Random r = new Random();
    Fight kampf = new Fight();
    Scanner scanner = new Scanner(System.in);

    public void summonCherry() throws Exception {


        float chance = r.nextFloat();
        if (GameState.cherry1Dead == false) {
            if (chance <= 0.01f) {
                System.out.println("Als du den Raum betrittst bemerkst du eine verdächtige Kirsche auf dem Boden liegen.");
                if (GameState.currentItems[1].equals("☕")) {
                    System.out.println("Die Kirsche fängt plötzlich an zu sprechen und sagt: ");
                    System.out.println("Im austausch für den Köstlichen Kaffee in deiner Hosentasche schenke ich dir dein Leben.");
                    System.out.println("\nMöchtest du ihm den [kaffee anbieten]?");
                    String wahl = scanner.nextLine();
                    if (wahl.equals("kaffe anbieten")) {
                        System.out.println("Weise Wahl mein freund, aber, wie du Weißt, man trifft sich immer zwei mal im Leben.");
                    } else {
                        kampf.kampf("cherry");
                    }
                } else {
                    kampf.kampf("cherry");
                }
            }
        }
    }
}
