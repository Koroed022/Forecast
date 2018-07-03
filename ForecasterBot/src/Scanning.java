
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.Timer;


public class Scanning implements Runnable{

    public static ArrayList<BetCreate> Bets1X = new ArrayList<BetCreate>();

    public static void Scan(String commands) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\Vlad\\Desktop\\bets\\MyBets.txt"), "UTF-8"));
        String strLine;
        FileWriter writer = new FileWriter("C:\\Users\\Vlad\\Desktop\\bets\\MyBets.txt", true);
        PrintWriter fileout = new PrintWriter(writer, true);


    }

    public void run() {
        try {
            Scan(FormClass.zadacha);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
