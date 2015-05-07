package Game;

import java.util.Objects;

/**
 * Blake Allan
 * 5/2/15.
 */

public class Play implements RPSInterface {

    public void runGame(int results){
        if (results == 2){
            System.out.println("YOU WON!!" + "\n");
        }
        else if (results == 1){
            System.out.println("Sorry! The computer won." + "\n");
        }
        else if (results == 3){
            System.out.println("It was a tie!" + "\n");
        }
        else {
            System.out.println("Invalid Entry" + "\n");
        }
    }
}
