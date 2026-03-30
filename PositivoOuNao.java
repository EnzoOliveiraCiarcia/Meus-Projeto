import java.util.Scanner;

public class PositivoOuNao {
    public static void main (String[] args) {
        //declara variável
        double numero;
        Scanner scanner = new Scanner(System.in);

        //entrada de dados
        System.out.println("digite um numero: ");
        numero = scanner.nextDouble();

        //estrutura de decisão
        if(numero > 0) {
            System.out.println(numero + " e positivo");
        } else {
            System.out.println(numero + " nao e positivo");
        }

        scanner.close();
    }
}