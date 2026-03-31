import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Cria o Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }

        // Fecha o scanner
        scanner.close();
    }
}

