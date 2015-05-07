package Game;

/**
 * Blake Allan
 * 5/2/15.
 */
public class GameRules implements RPSInterface {

    public int getWinner(int computerChoice, int playerChoice) {

        //If statements that return false if computer wins & true if player wins
        if (computerChoice == 1 && playerChoice == 2){
            return 2;
        }
        else if (computerChoice == 1 && playerChoice == 3){
            return 1;
        }
        else if (computerChoice == 2 && playerChoice == 1){
            return 1;
        }
        else if (computerChoice == 2 && playerChoice == 3){
            return 2;
        }
        else if (computerChoice == 3 && playerChoice == 1){
            return 1;
        }
        else if (computerChoice == 3 && playerChoice == 2){
            return 2;
        }
        else if (computerChoice == playerChoice){
            return 3;
        }
        else return 0;
    }
}
