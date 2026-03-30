import java.util.Scanner;
public class Exercicio2 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int numero1;
    int numero2;
    System.out.println ("Digite o primeiro número");
    numero1 = scanner.nextInt();
    System.out.println ("Digite o segundo número");
    numero2 = scanner.nextInt();

 if (numero1 > numero2) {
    System.out.println("O primeiro numero é maior");
    } else if (numero1 == numero2) {
    System.out.println("Os numeros sao iguais");
   } else {
    System.out.println("O segundo numero é maior");
}
        scanner.close();
    }
}

