package fondamenti;

import java.util.Random;

public class Stelline {

    public static void main(String[] args) {
        Random random = new Random();
        String rating = "";
        int l = random.nextInt(6);
            for (int k = 0; k < 5; k++) {
                if (k <= l) {
                    rating += '*';
                } else {
                    rating += '-';
                }
            }
        System.out.println(rating);
            }
        }

