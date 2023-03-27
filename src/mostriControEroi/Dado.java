package mostriControEroi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dado {

    private static final Random random = new Random();

    public static int roll(int massimo) {
        return random.nextInt(massimo);
    }

    public static int roll(int minimo, int massimo) {
        return ThreadLocalRandom.current().nextInt(minimo, massimo+1);
    }

    public static boolean roll() {
        return random.nextBoolean();
    }

}
