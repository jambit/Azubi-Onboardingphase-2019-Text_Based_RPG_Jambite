package com.jambit;


import javax.sound.midi.MidiSystem;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import java.io.*;

public class Music {


    public static Sequencer sequencer;

    static {
        try {
            sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void run(String titel) throws Exception {
        switch (titel) {
            case "intro":
                introMusic();
                break;
            /*
            case "küche":
                kueche();
                break;
            case "elevatorMusic":
                elevatorMusic();
                break;
            case "corridor1Music":
                corridor1Music();
                break;
            case "badgeloser":
                badgeloser();
                break;
            case "tobi":
                break;
            case "kopiermon":
                break;
            case "yannik":
                yannikMusic();
                break;
            */
            case "adal":
                adalMusic();
                break;
            /*
            case "cherry1":
                cherry1Music();
                break;
                /*
            case "cherry2":
                cherry2Music();
                break;
            case "gameover":
                gameOver();
                break;
            case "basementMusic":
                basement();
                break;
            case "corridor2Music":
                corridor2();
                break;
            case "drinksstorageMusic":
                drinksstorage();
                break;
            case "edekaMusic":
                edeka();
                break;
            case "hRMusic":
                hr();
                break;
            case "kickerroomMusic":
                kickerroom();
                break;
            case "kitchenMusic":
                kitchen();
                break;
            case "markusplatzMusic":
                markusplatz();
                break;
            case "roofMusic":
                roof();
                break;
            case "stairsMusic":
                stairs();
                break;
            case "streetMusic":
                street();
                break;
            case "sumatraMusic":
                sumatra();
                break;
            case "tapreroom":
                tapreroom();
                break;
            case "fishtank":
                fishtank();*/
            default:
                introMusic();
                break;

        }

    }

    /**
     * @sequencer.open starts the midi sequencer
     * @InputStream creates a inputstream and defines the path of the midi file
     * @sequencer.setSequence gives the midi path to the sequencer
     * @sequencer.start() starts the midi file playback
     */

    void introMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/spooky_intro.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }


    void tobiMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/circus.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void cherry1Music() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/polka1.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void cherry2Music() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void adalMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/bgrass1.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void druckerMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void yannikMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void kuecheMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void elevatorMusic() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }


    void corridor1Music() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void gameOver() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void badgeloser() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void basement() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void corridor1() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void corridor2() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void drinksstorage() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void edeka() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void elevator() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void fishtank() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void hr() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void kickerroom() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void kitchen() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void markusplatz() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void roof() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void stairs() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void street() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void sumatra() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }

    void tapreroom() throws Exception {

        sequencer.open();

        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/musik/.mid")));

        sequencer.setSequence(is);

        sequencer.start();
    }


}
