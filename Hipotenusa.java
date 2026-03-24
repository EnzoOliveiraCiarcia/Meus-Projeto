import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cateto a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o cateto b: ");
        double b = scanner.nextDouble();

        double aQuad = Math.pow(a, 2);
        double bQuad = Math.pow(b, 2);

        double hipotenusa = Math.sqrt(aQuad + bQuad);

        System.out.printf("Hipotenusa = %.2f\n", hipotenusa);

        scanner.close();
    }
}