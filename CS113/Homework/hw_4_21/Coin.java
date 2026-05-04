public class Coin {

    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    public Coin() {
        face = (int) (Math.random() * 2);
    }

    public void flip() {
        if (Math.random() < 0.5) {
            face = HEADS;
        } else {
            face = TAILS;
        }
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    @Override
    public String toString() {
        if (face == HEADS) {
            return "HEADS";
        }
        return "TAILS";
    }
}
