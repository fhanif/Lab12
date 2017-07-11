import java.util.Scanner;

/**
 * Created by fhani on 7/10/2017.
 */
public class Validation {

    public Validation() {
    }

    public static boolean continueValidation (String choice){
        Scanner scan = new Scanner(System.in);
        boolean validChoice = false;
        boolean userCont = false;

        while (!validChoice) {
            if(choice.equalsIgnoreCase("y")){
                validChoice = true;
                userCont= true;
            }else if (choice.equalsIgnoreCase("n")){
                validChoice = true;
                userCont = false;
            }
            else {
                System.out.println("Not a valid choice, enter y or n: ");
                choice = scan.nextLine();
                validChoice = false;
            }
        }
        return userCont;
    }

    public static void playerValidation (String playerChoice) {
        Scanner scan = new Scanner(System.in);

        while ((!playerChoice.equalsIgnoreCase("A1")) && (!playerChoice.equalsIgnoreCase( "A2"))) {

            System.out.println("Invalid entry! Enter A1 or A2!");
            playerChoice = scan.nextLine();
        }

    }
}
