import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:\n1 - à vista\n2 - a prazo\n--> ");
        int opcao = scanner.nextInt();

        // Cálculo do valor
        if (opcao == 2) {
            compra = compra + (compra * 10.0 / 100); // acréscimo de 10%
        }

        // Exibe resultado
        System.out.println("Valor a pagar = R$ " + compra);

        // Fecha scanner
        scanner.close();
    }
}