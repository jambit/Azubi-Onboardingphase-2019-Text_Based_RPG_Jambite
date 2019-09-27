package com.jambit;

public class Functions {


    public static void newPage() throws InterruptedException {
        for (int i = 0; i <= 40; i++) {
            System.out.println("");
        }
        Leben.statusLeiste();
    }

    public static void clear() throws InterruptedException {
        for (int i = 0; i <= 40; i++) {
            System.out.println("");
        }
    }

    public static void functions() throws InterruptedException {

        System.out.println("Herzlich Willkommen " + GameState.name + "\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(1500);
        Music.sequencer.stop();
    }
}
