import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();

        int triplo, dobro;
        triplo = numero * 3;
        dobro = numero * 2;

        int resultado;
        resultado = (triplo + 1) + (dobro - 1);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
