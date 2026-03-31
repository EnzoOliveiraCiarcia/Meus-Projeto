import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular média
        double media = (nota1 + nota2 + nota3) / 3;

        // Verificar status
        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 3) {
            System.out.println("Aluno de exame. Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }

        scanner.close();
    }
}