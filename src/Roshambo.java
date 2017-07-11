/**
 * Created by fhani on 7/10/2017.
 */
public enum Roshambo {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");

    private String prettyName;

    Roshambo(String prettyName) {
        this.prettyName = prettyName;
    }

    @Override
    public String toString () {
        return prettyName;
    }
}



