import java.util.Scanner;

public class Desafio_002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int a = 0;
        int b = 1;
        int soma = a + b;

        while (soma <= numero) {
            a = b;
            b = soma;
            soma = a + b;
        }

        if (b == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
