import java.util.Scanner;

public class loteria {

    public static void main(String[] args) {
        double ganhador1 = 46.0 / 100 * 700000;
        double ganhador2 = 32.0 / 100 * 780000.0;
        double ganhador3 = 780000.0 - ganhador1 - ganhador2;

        System.out.printf(
            "Ganhador 1: %.2f\nGanhador 2: %.2f\nGanhador 3: %.2f\n",
            ganhador1, ganhador2, ganhador3
        );
    }
}