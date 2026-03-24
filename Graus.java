import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radianos, graus;

        System.out.println("Digite o ângulo em graus: ");
        graus = scanner.nextDouble();

        radianos = graus * Math.PI / 180;

        System.out.printf("%.2f\u00B0 = %.3f rad\n", graus, radianos);

        scanner.close();
    }
}
