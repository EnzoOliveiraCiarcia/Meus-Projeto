//ler dois números quaisquer, soma e exibir o resultado
import java.util.Scanner;
public class SomaDois {
    public static void main (String[] args) {
        //declara e instancia o Scanner
        Scanner scanner = new Scanner(System.in);
        //entrada de dados e declaração das variáveis
        System.out.print ("digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        //processamento
        double soma = primeiroNumero + segundoNumero;
        //saída
        System.out.println ("soma = " + soma);
        scanner.close();
    }
}
