import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        double valorCompra, valorFinal = 0;
        int opcaoPagamento;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        System.out.print("Digite:\n1 - à vista\n2 - a prazo\n--> ");
        opcaoPagamento = scanner.nextInt();

        if (opcaoPagamento == 1) {
            int formaPagamento;
            System.out.print("Forma de pagamento:\n1 - Pix\n2 - Débito\n--> ");
            formaPagamento = scanner.nextInt();

            if (formaPagamento == 1) {
                valorFinal = valorCompra * 0.9; // 10% desconto
                System.out.println("Desconto de 10% (Pix)");
            } else if (formaPagamento == 2) {
                valorFinal = valorCompra * 0.95; // 5% desconto
                System.out.println("Desconto de 5% (Débito)");
            } else {
                System.out.println("Opção inválida");
                return;
            }

        } else if (opcaoPagamento == 2) {
            int parcelas;
            System.out.print("Número de parcelas (2 ou 4): ");
            parcelas = scanner.nextInt();

            if (parcelas == 2) {
                valorFinal = valorCompra; // sem acréscimo
                System.out.println("Sem acréscimo em 2x");
            } else if (parcelas == 4) {
                valorFinal = valorCompra * 1.10; // 10% acréscimo
                System.out.println("Acréscimo de 10% em 4x");
            } else {
                System.out.println("Opção inválida");
                return;
            }

            double valorParcela = valorFinal / parcelas;
            System.out.println("Valor de cada parcela: R$ " + valorParcela);

        } else {
            System.out.println("Opção inválida");
            return;
        }

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}