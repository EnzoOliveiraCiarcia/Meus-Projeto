import java.util.Scanner;

public class TesteEntradas {
    public static void main(String[] args) {
        // Declarando e instanciando um objeto Scanner
        Scanner scanner = new Scanner(System.in);
        // Exibe mensagem para o usuário
        System.out.print("Digite um valor inteiro: ");
        // Declara um numero inteiro e pede para fazer a leitura
        int valorInteiro = scanner.nextInt();
        // Exibe mensagem para o usuário
        System.out.print("Digite um valor com casas decimais: ");
        // Declara um double e faz a leitura
        double valorDecimal = scanner.nextDouble();
        System.out.print("Digite verdadeiro (true) ou falso (false): ");
        boolean eVerdade = scanner.nextBoolean();
        //Exibir os valores digitados
        System.out.println( "");
        // Libera o recurso
        scanner.close();
    }
}
