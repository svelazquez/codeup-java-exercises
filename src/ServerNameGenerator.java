import java.util.*;

public class ServerNameGenerator {

    public static void main(String[] args) {
        System.out.println(serverName());
    }


    public static String serverName() {
        //returns range 0 to 10;
        int r = new Random().nextInt(10) + 1;
        int rr = new Random().nextInt(10) + 1;
        String[] adj ={
            "smart", "funny", "weird", "tolerable", "wiley", "tall", "luscious", "caring", "bombastic", "large"
        } ;
        String[] nouns ={
            "bird", "library", "doggo", "star", "elephant", "giant", "forest", "fairy", "candle", "hexagon"
        } ;

        return adj[r] + "-" + nouns[rr];

    }
}
