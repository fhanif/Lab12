import java.util.Scanner;

/**
 * Created by fhani on 7/10/2017.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your name: ");
        HumanPlayer name = new HumanPlayer();
        String userName = name.getName();
        System.out.println();
        Validation validate = new Validation();

//        String choice = "";
//        Validation validCheck = new Validation();
//        validCheck.continueValidation(choice);
        //HOW DO I OUTPUT THE VALIDATION?? WHERE??
        String keepGoing = "";
        do {
            System.out.println("Who would you like to play against, Autoplayer 1 or Autoplayer2? (A1/A2): ");
            //scnr.next();
            String playerChoice = scnr.nextLine();

            validate.playerValidation(playerChoice);

            AutoPlayer1 player1 = new AutoPlayer1();
            AutoPlayer2 player2 = new AutoPlayer2();
            HumanPlayer player3 = new HumanPlayer();

            Roshambo playerSelection = player3.generateRoshambo();
            Roshambo computerSelection1 = (player1.generateRoshambo());
            Roshambo computerSelection2 = (player2.generateRoshambo());

            if (playerChoice.equalsIgnoreCase("A1")) {
                System.out.println("Autoplayer 1: " + computerSelection1);
                System.out.println(userName + ": " + playerSelection);

                //why does it work if its a roshambo variable

                if (computerSelection1.equals(playerSelection)) {
                    System.out.println("Draw!");
                } else if ((playerSelection.toString().equalsIgnoreCase("Paper"))) { // will this work???? or need to use choice variable? (.getChoice)???
                    System.out.println(userName + " wins!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    System.out.println("Autoplayer 1 wins!");
                }
            }

            if (playerChoice.equalsIgnoreCase("A2")) {
                System.out.println("Autoplayer 2: " + computerSelection2);
                System.out.println(userName + ": " + playerSelection);


                if (computerSelection2.equals(playerSelection)) {
                    System.out.println("Draw!");

                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {

                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " loses!");
                    } else {
                        System.out.println(userName + " wins!");
                    }

                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " wins!");
                    } else {
                        System.out.println(userName + " loses!");
                    }

                } else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Scissors")) {
                        System.out.println(userName + "wins!");
                    } else {
                        System.out.println(userName + "loses!");
                    }

                }
            }

            System.out.println();
            System.out.println("Would you like to continue? (Y/N)");
            keepGoing = scnr.nextLine();

        } while (validate.continueValidation(keepGoing));
        System.out.println("Goodbye");
    }
}
