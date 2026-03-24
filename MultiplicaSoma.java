import java.util.Scanner;

public class MultiplicaSoma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, resultadoDouble;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        num3 = scanner.nextDouble();

        resultadoDouble = (num1 + num2) * num3;

        System.out.println("Resultado: " + resultadoDouble);

        scanner.close();
    }
}
