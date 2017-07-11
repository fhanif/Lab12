import java.util.Random;

/**
 * Created by fhani on 7/10/2017.
 */
public class AutoPlayer2 extends Player {
    @Override
    public Roshambo generateRoshambo() {

        int randNum = (int) (Math.random() * 2);
        switch (randNum){
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                System.out.println("Something went wrong with switch logic");
                break;
        }
        //System.out.println(randNum);

        return null;
    }
}
