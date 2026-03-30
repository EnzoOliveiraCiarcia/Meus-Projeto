import java.util.Scanner;

public class PositivoNegativoNeutro {
    public static void main (String[] args) {
        //declara variáveis
        Scanner scanner = new Scanner(System.in);
        double numero;

        //entrada de dados
        System.out.print("digite um numero: ");
        numero = scanner.nextDouble();

        //controle de fluxo
        if (numero > 0) {
            System.out.println(numero + " positivo");
        } else if (numero == 0) {
            System.out.println(numero + " neutro");
        } else {
            System.out.println(numero + " negativo");
        }

        scanner.close();
    }
}