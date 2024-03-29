package highscore;

import com.jambit.GameState;
import com.jambit.Leben;

import java.io.PrintWriter;
import java.io.*;

public class SaveGame {
    public static void showHighscore() throws IOException {

        {

            {
                FileReader fr = new FileReader("JambiteHighscore.txt");
                BufferedReader br = new BufferedReader(fr);

                String zeile = "";

                do {
                    zeile = br.readLine();
                    if(zeile != null)
                        System.out.println(zeile);
                }
                while (zeile != null);

                br.close();
            }
        }

    }

    public static void setHighscore() throws IOException {

        FileWriter fw = new FileWriter("JambiteHighscore.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.append(GameState.name + ": "+ GameState.xp);
        bw.close();
    }

    public static void winTheGame() throws IOException, InterruptedException {
        System.out.println("\nDu hast es geschafft!");
        Leben.statusLeiste();
        setHighscore();
        System.out.println("Vergleiche hier deinen Highscore mit dem von anderen:");
        showHighscore();
        System.out.println("\npress enter to end the game");
        System.in.read();

    }
}

