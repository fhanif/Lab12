import java.util.Scanner;

/**
 * Created by fhani on 7/10/2017.
 */
public class Validation {

    public Validation() {
    }

    public static void continueValidation (String choice){
        Scanner scan = new Scanner(System.in);
        choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            //get some input from the user and do some stuff
            System.out.println("Continue? (y/n)");
            choice = scan.nextLine();
        }
        System.out.println("Goodbye");

    }
}
