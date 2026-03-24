import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quilometros, milhas;

        System.out.println("Digite a distância em quilômetros: ");
        quilometros = scanner.nextDouble();

        milhas = quilometros / 1.61;

        System.out.println(quilometros + " km = " + milhas + " milhas");

        scanner.close();
    }
}
