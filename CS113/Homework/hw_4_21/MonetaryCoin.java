public class MonetaryCoin extends Coin {

    private static final int HEADS = 0;
    private static final int TAILS = 1;

    private int monetaryValue;
    private int face;

    public MonetaryCoin(int monetaryValue) {
        if (monetaryValue < 1 || monetaryValue > 100) {
            throw new IllegalArgumentException("Monetary value must be between 1 and 100.");
        }

        this.monetaryValue = monetaryValue;
        flip();
    }

    public int getMonetaryValue() {
        return monetaryValue;
    }

    public void setMonetaryValue(int monetaryValue) {
        if (monetaryValue < 1 || monetaryValue > 100) {
            throw new IllegalArgumentException("Monetary value must be between 1 and 100.");
        }

        this.monetaryValue = monetaryValue;
    }

    public void flip() {
        face = (Math.random() < 0.5) ? HEADS : TAILS;
    }

    public boolean isHeads() {
        return face == HEADS;
    }

    @Override
    public String toString() {
        String faceName = (face == HEADS) ? "HEADS" : "TAILS";
        return "(" + monetaryValue + ", " + faceName + ")";
    }
}
