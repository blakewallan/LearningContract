package Game;

import javax.swing.*;
import java.util.Scanner;

/**
 * Blake Allan
 * 5/3/15.
 */
public abstract class RPSGUI implements RPSInterface {

    private JTextArea textArea1;
    private JPanel panel1;

    public static void main(String[] args) {

        WelcomeMenu welcomeMenu = new WelcomeMenu();
        welcomeMenu.printWelcome();

        Scanner console = new Scanner(System.in);
        System.out.print("How many rounds would you like to play? ");
        int rounds = console.nextInt();

        GameRules newGame = new GameRules();
        Play play = new Play();

        for (int i = 0; i < rounds; i++) {

            System.out.print("Enter your move: ");
            Player1 player1 = new Player1();
            int player1Choice = player1.getChoice();

            ComputerPlayer computerPlayer = new ComputerPlayer();
            int computerChoice = computerPlayer.getChoice();

            play.runGame(newGame.getWinner(player1Choice, computerChoice));
        }
    }

}
