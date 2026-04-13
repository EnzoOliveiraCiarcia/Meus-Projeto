import java.util.Scanner;

public class Soma2000 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite números até a soma chegar em 1000: ");
            numero = sc.nextInt();
            soma = soma + numero;
        } while (soma < 2000);

        System.out.println("Soma final: " + soma);
    }
}