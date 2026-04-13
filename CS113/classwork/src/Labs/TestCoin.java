package CS113.Labs;

public class TestCoin {

    public static void main(String[] args) {
        //Create 3 biased coins, one is fair, one is bias towards tails,
        // the last is bias towards heads
        Coin coinFair = new Coin();
        Coin coinHeads = new Coin();
        Coin coinTails = new Coin();

        coinHeads.BiasedCoin(.4);
        coinTails.BiasedCoin(.6);

        //Flip each coin 100 times
        int countFair = flipCoin(coinFair);
        int countHeads = flipCoin(coinHeads);
        int countTails = flipCoin(coinTails);

        System.out.println("Fair coin: " + countFair);
        System.out.println("Heads coin: " + countHeads);
        System.out.println("Tails coin: " + countTails);
    }

    public static int flipCoin(Coin coin) {
        int headsCount = 0;
        for (int i = 0; i < 100; i++) {
            coin.flip();

            if (coin.isHeads()) {
                headsCount++;
            }
        }
        return headsCount++;
    }

    /*
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();

        coin1.BiasedCoin(.5);
        coin1.BiasedCoin(.4);
        coin1.BiasedCoin(.6);

        int head1 = 0;
        int head2 = 0;
        int head3 = 0;

        int tails1 = 0;
        int tails2 = 0;
        int tails3 = 0;

        for (int i = 0; i <= 100; i++) {
            coin1.flip();
            coin2.flip();
            coin3.flip();

            if (coin1.isHeads()) {
                head1 += 1;
            } else {
                tails1 += 1;
            }

            if (coin2.isHeads()) {
                head2 += 1;
            } else {
                tails2 += 1;
            }

            if (coin3.isHeads()) {
                head3 += 1;
            } else {
                tails3 += 1;
            }
        }

        System.out.println("---------------------------------");
        System.out.println("coin1 heads: " + head1);
        System.out.println("coin1 tails: " + tails1);
        System.out.println("---------------------------------");
        System.out.println("coin2 heads: " + head2);
        System.out.println("coin2 tails: " + tails2);
        System.out.println("---------------------------------");
        System.out.println("coin3 heads: " + head3);
        System.out.println("coin3 tails: " + tails3);
        System.out.println("---------------------------------");

        int newCoin=FlipCoin(.5);
        
    }

    public int FlipCoin(int amnt) {
        Coin coin1 = new Coin();
        int headsAmnt = 0;

        for (int i = 0; i <= amnt; i++) {
            if (coin1.isHeads()) {
                headsAmnt++;
            }
        }
        return headsAmnt;
    }

    // re-do same thing but with one method

    // flip a coin 60 times, print longest run of heads
}

 */
}
