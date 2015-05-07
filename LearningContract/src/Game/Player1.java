package Game;
import com.sun.tools.javah.Util;

import java.util.*;

/**
 * Blake Allan
 * 5/2/15.
 */
public class Player1 implements RPSInterface {

    public int getChoice() {
        Scanner console = new Scanner(System.in);
        String choice = console.next();

        if (choice.equalsIgnoreCase("r")) {
            return 1;
        }
        else if (choice.equalsIgnoreCase("p")) {
            return 2;
        }
        else if (choice.equalsIgnoreCase("s")) {
            return 3;
        }
        else if (choice.equalsIgnoreCase("q")){
            return 4;
        }
        else return 0;
    }
}
