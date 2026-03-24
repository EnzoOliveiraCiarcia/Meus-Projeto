public class Variaveis {
    public static void main (String[] args) {
    //Entrada Variáveis
    int a = 19, b = 4;
    //Operações Com Variáveis Inteiras
    int soma = a + b;
    int subtracao = a - b;
    int multiplicacao = a * b;
    int divisao = a / b;
    int resto = a % b;
    //Resultado das operações 
    System.out.println ("Soma = " + soma);
    System.out.println ("Subtração = " + subtracao);
    System.out.println ("Multiplicação = " + multiplicacao);
    System.out.println ("Divisao = " + divisao);
    System.out.println ("Resto = " + resto);
    //Trabalhando com variáveis double 
    //declaração
    double x = 7.5, y = 0.25; 
    double somaDouble = x + y; 
    double subtracaoDouble = x - y;
    double multiplicacaoDouble = x * y;
    double divisaoDouble = a / b;
    System.out.println (" Double ");
    System.out.println ("Soma = " + somaDouble);
    System.out.println ("Subtração = " + subtracaoDouble);
    System.out.println ("Multiplicação = "+ multiplicacaoDouble);
    System.out.println ("Divisão = " + divisaoDouble);
    System.out.println (x + " + " + y + " = " + somaDouble);
    System.out.println (x + " - " + y + " = " + subtracaoDouble);
    System.out.println (x + " * " + y + " = " + multiplicacaoDouble);
    System.out.println (x + " / " + y + " = " + divisaoDouble);
    //Exemplo de int com double 
    double resultado = a * x + b * y;
    System.out.println ("resultado = " + resultado);
    String nome = "Gabriel", sobrenome = "Ramos";
    System.out.println (nome + " " + sobrenome);
    }
}
