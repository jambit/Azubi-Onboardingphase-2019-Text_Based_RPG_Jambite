package com.jambit;

import java.util.ArrayList;
import java.util.List;

public class Weapons {
    public static int playerDamage1 = 10;
    public static int playerDamage2 = 20;
    public static float playerHitChance1 = 0.50f;
    public static float playerHitChance2 = 0.30f;
    public static String weaponAscii;
    public static String weaponName;
    public static String currentWeapon;
    public static List<String> foundWeapons = new ArrayList<>();


    public static void weaponFound(String nameOfWeapon) {
        if (nameOfWeapon == "faust") {
            foundWeapons.add("faust");
        } else if (nameOfWeapon == "kugelschreiber") {
            foundWeapons.add("kugelschreiber");

        }
    }

    void faust() {
        weaponName = "Fäuste";
        weaponAscii = "  .----.-----.-----.-----.\n" +
                " /      \\     \\     \\     \\\n" +
                "|  \\/    |     |   __|_____|__\n" +
                "|   |    |     |  (           \\\n" +
                "|    \\___/    /    \\______/    |\n" +
                "|        \\___/\\___/\\___/       |\n" +
                " \\      \\     /               /\n" +
                "  |                        __/\n" +
                "   \\_                   __/\n" +
                "    |        |         |\n" +
                "    |                  |\n" +
                "    |                  |";
        playerDamage1 = playerDamage1 + 0;
        playerDamage2 = playerDamage2 + 0;
        playerHitChance1 = playerHitChance1 + 0;
        playerHitChance2 = playerHitChance2 + 0;


    }

    void kugelschreiber() {
        weaponName = "\nKugelschreiber";
        weaponAscii =

                " __\n" +
                        "(__)\n" +
                        "|  |\\\n" +
                        "|  ||\n" +
                        "|  ||\n" +
                        "|__||\n" +
                        "|  |\n" +
                        "|  |\n" +
                        "|  |\n" +
                        "|  |\n" +
                        "\\||/\n" +
                        " \\/\n" +
                        "\n";
        playerDamage1 = playerDamage1 * 2;
        playerDamage2 = playerDamage2 * 2;
        playerHitChance1 = playerHitChance1 + 0;
        playerHitChance2 = playerHitChance2 + 0;

    }

    void switchWeapon() {
        if (currentWeapon == "faust") {
            faust();
        } else if (currentWeapon == "kugelschreiber") {
            kugelschreiber();
        }
    }
}

