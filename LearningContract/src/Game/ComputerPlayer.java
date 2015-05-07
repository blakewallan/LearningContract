package Game;
import java.util.*;

/**
 * Blake Allan
 * 5/2/15.
 */
public class ComputerPlayer implements RPSInterface {

    public int getChoice() {
        Random rand = new Random(3);
        return rand.nextInt(3 - 1 + 1) + 1;
    }
}
