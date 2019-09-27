package highscore;

import com.jambit.GameState;

import java.io.PrintWriter;
import java.io.*;

public class SaveGame {
    public static void showHighscore() throws IOException {

        {

            {
                FileReader fr = new FileReader("src/highscore/JambiteHighscore.txt");
                BufferedReader br = new BufferedReader(fr);

                String zeile = "";

                do {
                    zeile = br.readLine();
                    System.out.println(zeile);
                }
                while (zeile != null);

                br.close();
            }
        }

    }

    public void setHighscore() throws IOException {

        FileWriter fw = new FileWriter("ausgabe.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(GameState.name + ": "+ GameState.xp);
        bw.close();
    }
}
