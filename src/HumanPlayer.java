import java.util.Scanner;

/**
 * Created by fhani on 7/10/2017.
 */
public class HumanPlayer extends Player {

    @Override
    public Roshambo generateRoshambo() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose rock(r), paper(p), or scissors(s): ");
        String userChoice = scnr.nextLine();
        Roshambo choice = null;
        if(userChoice.equalsIgnoreCase("r") ){
//
            choice = Roshambo.ROCK;
        }
        else if (userChoice.equalsIgnoreCase("p")) {

            choice = Roshambo.PAPER;
        }
        else if (userChoice.equalsIgnoreCase("s"))
            choice = Roshambo.SCISSORS;
        return choice;
    }
}
