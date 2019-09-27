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
                    if(zeile != null)
                        System.out.println(zeile);
                }
                while (zeile != null);

                br.close();
            }
        }

    }

    public static void setHighscore() throws IOException {

        FileWriter fw = new FileWriter("src/highscore/JambiteHighscore.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.append(GameState.name + ": "+ GameState.xp);
        bw.close();
    }
}
