package fondamenti;

public class GiornoSettimana {

    public static String giorniSwitch(int x) {
        return switch (x) {
            default -> null;
            case 1 -> "Lunedì";
            case 2 -> "Martedì";
            case 3 -> "Mercoledì";
            case 4 -> "Giovedì";
            case 5 -> "Venerdì";
            case 6 -> "Sabato";
            case 7 -> "Domenica";
        };
    }

    public static void giorniIf(int x) {
        if (x == 1) {
            System.out.println("Lunedì");
        } else if (x == 2) {
            System.out.println("Martedì");
        } else if (x == 3) {
            System.out.println("Mercoledì");
        } else if (x == 4) {
            System.out.println("Giovedì");
        } else if (x == 5) {
            System.out.println("Venerdì");
        } else if (x == 6) {
            System.out.println("Sabato");
        } else if (x == 7) {
            System.out.println("Domenica");
        } else {
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        System.out.println(giorniSwitch(2));
//        giorniIf(4);
    }
}
