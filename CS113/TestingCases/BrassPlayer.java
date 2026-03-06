package CS113.TestingCases;

public class BrassPlayer {

    private String playerName, Brassinstrument;
    private int expYrs;

    public BrassPlayer(String name, String instrument, int years) {
        playerName = name;
        Brassinstrument = instrument;
        expYrs = years;
    }

    public String getInstrument() {
        return (Brassinstrument);
    }

    public String getName() {
        return (playerName);
    }

    public int getYrs() {
        return (expYrs);
    }

    // not sure about setters

    public boolean isVeteran(int expYrs) {
        if (expYrs >= 2) return true;
        else return false;
    }

    public String toString() {
        return (
            "Name: " +
            playerName +
            ", Instrument: " +
            Brassinstrument +
            ", Expirenece: " +
            expYrs +
            " Years"
        );
    }

    public void setExpYrs(int years) {
        expYrs = years;
    }

    public int compareTo(BrassPlayer other) {
        if (expYrs > other.getYrs()) return 1;
        else if (expYrs == other.getYrs()) return 0;
        else return -1;
    }
}
