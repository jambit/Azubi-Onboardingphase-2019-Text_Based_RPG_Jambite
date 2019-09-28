package com.jambit;

public class Enemies {
    public static String quickAttack;
    public static String strongAttack;
    public static String attack3;
    public static String attack4;
    public static int enemyHealth;
    public static double trefferChance;
    public static int gegnerSchaden;
    public static String gegnerName;
    public static String gegnerAscii;
    public static int xp;
    public static String klasse;
    public static String nameNeu;
    public static String enemyAttack1;
    public static String enemyAttack2;
    public static String song;

    void tobi() {
        gegnerAscii =
                "    \n" +
                        "\n" +
                        "                                 .       .\n" +
                        "                                / `.   .' \\\n" +
                        "                        .---.  <    > <    >  .---.\n" +
                        "                        |    \\  \\ - ~ ~ - /  /    |\n" +
                        "                         ~-..-~             ~-..-~\n" +
                        "                     \\~~~\\.'                    `./~~~/\n" +
                        "           .-~~^-.    \\__/                        \\__/\n" +
                        "         .'  O    \\     /               /       \\  \\\n" +
                        "        (_____,    `._.'               |         }  \\/~~~/\n" +
                        "         `----.          /       }     |        /    \\__/\n" +
                        "               `-.      |       /      |       /      `. ,~~|\n" +
                        "                   ~-.__|      /_ - ~ ^|      /- _      `..-'        \n" +
                        "                        |     /        |     /     ~-.     `-. _||_||_\n" +
                        "                        |_____|        |_____|         ~ - . _ _ _ _ _>\n" +
                        "\n" +
                        "\n";
        gegnerName = "Tobi";
        klasse = "Gegner: ";
        song = "tobi";
        quickAttack = "Acid Attack";
        strongAttack = "Weitwurf";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 1000;
        trefferChance = 0.70f;
        gegnerSchaden = 50;
        xp = 25000;
        damageMod();


    }

    void yannik() {
        gegnerAscii = "           ( (`  ,--.\n" +
                "      ,--.  ) )\\  `) ).--,\n" +
                "       `) )/ /) ) ( (( (`\n" +
                "       / /( (.  \"-.) )) )\n" +
                "   ,-.( ( /          / /,--,\n" +
                "    `) \\ ` ==.    .==  ( (`\n" +
                "    ( (_) ~6~      ~6~ _) )\n" +
                "     \\_ (      )(      )_/\n" +
                "    ,-,\\ \\     ^^     /\\ ,-.\n" +
                "   ( (_/ /\\    __,   /\\ \\_) )\n" +
                "    '._.' _\\  /__/  /_ '._.'\n" +
                "      .--`  \\ `    /  `--.\n" +
                " jgs         '----'";
        gegnerName = "Janomom";
        klasse = "Gegner: ";
        song = "yannik";
        quickAttack = "Zigaretten klauen";
        strongAttack = "Alkohol-Entzug";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 150;
        trefferChance = 0.20f;
        gegnerSchaden = 40;
        xp = 1500;
        damageMod();
    }

    void printer() {
        gegnerAscii = "    ________________\n" +
                "  _/_______________/|\n" +
                " /___________/___//||\n" +
                "|===        |----| ||\n" +
                "|           |   ô| ||\n" +
                "|___________|   ô| ||\n" +
                "| ||/.´---.||    | ||\n" +
                "|-||/_____\\||-.  | |´\n" +
                "|_||=======||_|__|/  ";
        gegnerName = "Kopierermon";
        klasse = "Boss: ";
        nameNeu = gegnerName + "              ";
        song = "kopiermon";
        quickAttack = "Papierstau verursachen";
        strongAttack = "Stecker ziehen";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 200;
        trefferChance = 0.20f;
        gegnerSchaden = 30;
        xp = 5000;
        damageMod();

    }

    void badgeloser() {
        gegnerAscii = "      ////^\\\\\\\\\n" +
                "      | ^   ^ |\n" +
                "     @ (o) (o) @\n" +
                "      |   <   |\n" +
                "      |  ___  |\n" +
                "       \\_____/\n" +
                "     ____|  |____\n" +
                "    /    \\__/    \\\n" +
                "   /              \\\n" +
                "  /\\_/|        |\\_/\\\n" +
                " / /  |        |  \\ \\\n" +
                "( <   |        |   > )\n" +
                " \\ \\  |        |  / /\n" +
                "  \\ \\ |________| / /";

        gegnerName = "Badgeloser";
        nameNeu = gegnerName + "            ";
        song = "badgeloser";
        klasse = "Gegner: ";
        quickAttack = "Am Ohr herausziehen";
        strongAttack = "Tritt in den Arsch";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 100;
        trefferChance = 0.25f;
        gegnerSchaden = 20;
        xp = 1000;
        damageMod();

    }

    void adal() {
        gegnerAscii = "                           `-.\n" +
                "              -._ `. `-.`-. `-.\n" +
                "             _._ `-._`.   .--.  `.\n" +
                "          .-'   '-.  `-|\\/    \\|   `-.\n" +
                "        .'         '-._\\   (o)O) `-.\n" +
                "       /         /         _.--.\\ '. `-. `-.\n" +
                "      /|    (    |  /  -. ( -._( -._ '. '.\n" +
                "     /  \\    \\-.__\\ \\_.-'`.`.__'.   `-, '. .'\n" +
                "     |  /\\    |  / \\ \\     `--')/  .-'.'.'\n" +
                " .._/  /  /  /  / / \\ \\          .' . .' .'\n" +
                "/  ___/  |  /   \\ \\  \\ \\__       '.'. . .\n" +
                "\\  \\___  \\ (     \\ \\  `._ `.     .' . ' .'\n" +
                " \\ `-._\\ (  `-.__ | \\    )//   .'  .' .-'\n" +
                "  \\_-._\\  \\  `-._\\)//    \"\"_.-' .-' .' .'\n" +
                "    `-'    \\ -._\\ \"\"_..--''  .-' .'\n" +
                "            \\/    .' .-'.-'  .-' .-'\n" +
                "                .-'.' .'  .' .-'\n";
        gegnerName = "Adalbert";
        nameNeu = gegnerName + "";
        klasse = "Boss: ";
        song = "adal";
        quickAttack = "Spezi Klauen";
        strongAttack = "Kicker-Verbot";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 100;
        trefferChance = 0.50f;
        gegnerSchaden = 10;
        xp = 1250;
        damageMod();
    }
    void cherryHuman(){
        gegnerAscii = "                                                                                        \n" +
                "                                                      ██                                \n" +
                "                                          ██    ██████                                  \n" +
                "                                          ██  ██▒▒▒▒██                                  \n" +
                "                                        ██████▒▒▒▒▒▒██                                  \n" +
                "                                        ██  ██▒▒▒▒██                                    \n" +
                "                                      ██    ██████                                      \n" +
                "                                    ██    ██                                            \n" +
                "                                    ██    ██                                            \n" +
                "                                  ██        ██                                          \n" +
                "                                ██            ████████                                  \n" +
                "                            ████████        ██▒▒▒▒▒▒▒▒██                                \n" +
                "                          ██▒▒▒▒▒▒▒▒██    ██▒▒▒▒▒▒▒▒▒▒▒▒██                              \n" +
                "                        ██▒▒▒▒▒▒  ▒▒▒▒██  ██▒▒▒▒▒▒▒▒▒▒▒▒██                              \n" +
                "                        ██▒▒▒▒▒▒▒▒  ▒▒██  ██▒▒  ▒▒▒▒▒▒▒▒██                              \n" +
                "                        ██▒▒▒▒▒▒▒▒  ▒▒██  ██▒▒▒▒    ▒▒▒▒██                              \n" +
                "                        ██▒▒▒▒▒▒▒▒▒▒▒▒██    ██▒▒▒▒▒▒▒▒██                                \n" +
                "                          ██▒▒▒▒▒▒▒▒██        ████████                                  \n" +
                "                            ████████                                                    \n" +
                "                                                                 ";
        gegnerName = "Cherry";
        nameNeu = gegnerName + "";
        klasse = "Boss: ";
        song = "cherry1";
        quickAttack = "Deep-Talk";
        strongAttack = "Kuchen-Mail";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 200;
        trefferChance = 0.20f;
        gegnerSchaden = 20;
        xp = 5000;
        damageMod();


    }

    void beispiel() {
        /*gegnerAscii = "";
        gegnerName = "";
        nameNeu = "";
        klasse = "";
        song = "";
        quickAttack = "";
        strongAttack = "";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = ;
        trefferChance = ;
        gegnerSchaden = ;
        xp = ;
        damageMod();*/
    }
    void kickermonster() {
        gegnerAscii = "                                          .-. _)/\n" +
                "                                         (0,0) .\\\n" +
                "                                          (u)   ()\n" +
                "     .-.                           _\\)  .-=\"=-.//\n" +
                "    (o,o)                            \\,//==\\===\n" +
                "     (e)                              ()  =====            .-.\n" +
                "   .-=\"=-.  \\(_           .-.         _____ =,=           (a.a)\n" +
                "  //==I==\\\\,/            (d.b)       ()--___(0V0)  (/_     (=)\n" +
                " ()  =\"=  ()              (u)        ||()----'      \\, ___.=\"==-._\n" +
                "  \\`(0V0)               .-=\"-.       |' \\\\           ()---` ==\\==\\\\\n" +
                " /|) ||\\\\              //==/=\\\\    ==\"   \\'                   =\"= ()\n" +
                "     || \\\\  ==.       () ==== ()_/_    ==\"               ____(0V0) \\`\n" +
                "     ()  ()    \\,      `\\\"=      `                      ()---` // (|\\\n" +
                "    //  //      \\\\ ___(0);`                             ||    //\n" +
                "   '/  '/        ()---'  \\\\                             |'   ()\n" +
                "   \"== \"==                \\\\                          ==\"     \\\\\n" +
                "                           ()                                  \\`\n" +
                "                          //                                  ==\"\n" +
                "                         '/                             \n" +
                "                         \"==    ";
        gegnerName = "Kickermonster";
        nameNeu = gegnerName + "";
        klasse = "Boss: ";
        song = "";
        quickAttack = "Pass";
        strongAttack = "Abroller";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 300;
        trefferChance = 0.30f;
        gegnerSchaden = 30;
        xp = 7000;
        damageMod();
    }




    void triangle() {
        gegnerAscii = "        /\\   \\        \n" +
                "         /  \\   \\\n" +
                "                 /    \\   \\\n" +
                "                 /      \\   \\\n" +
                "                 /   /\\   \\   \\\n" +
                "                 /   /  \\   \\   \\\n" +
                "                 /   /    \\   \\   \\\n" +
                "                 /   /    / \\   \\   \\\n" +
                "                 /   /    /   \\   \\   \\\n" +
                "                 /   /    /---------'   \\\n" +
                "                 /   /    /_______________\\\n" +
                "            \\  /                     /\n" +
                "            \\/_____________________/";
        gegnerName = "Dreieck";
        klasse = "Gegner: ";
        song = "yannik";
        quickAttack = "die Ecke falten";
        strongAttack = "rollen";
        enemyAttack1 = "";
        enemyAttack2 = "";
        enemyHealth = 150;
        trefferChance = 0.20f;
        gegnerSchaden = 40;
        xp = 1500;
        damageMod();
    }


    void damageMod() {
        if (GameState.difficulty == "leicht") {
            gegnerSchaden = (int) (gegnerSchaden * 0.75);
            enemyHealth = (int) (enemyHealth * 0.75);
            xp = (int) (xp * 0.75);
        } else if (GameState.difficulty == "normal") {
            gegnerSchaden = gegnerSchaden * 1;
            enemyHealth = enemyHealth * 1;
            xp = xp * 1;
        } else if (GameState.difficulty == "hardcore") {
            gegnerSchaden = (int) (gegnerSchaden * 1.5);
            enemyHealth = (int) (enemyHealth * 1.5);
            xp = (int) (xp * 1.5);
        }
    }
}
