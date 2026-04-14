//sortear um número de 1 a 10 e pedir para o usuário acertar 
import java.util.Random;
import java.util.Scanner;
public class AdivinhaNumero {

    public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    Random random = new Random();

    int sorteado = random.nextInt(10) + 1;
     int chute;
     do {
    System.out.print ("adivinhe um numero de 1 a 10: ");
    chute = scanner.nextInt();
     } while (chute != sorteado);
     scanner.close();
    }
}