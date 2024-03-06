import java.util.Scanner;

public class Desafio_005 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavraRecebida = entrada.nextLine();
        String palavraRevertida = "";

        for(int i = palavraRecebida.length() - 1 ; i >=0 ; i--) {
            palavraRevertida = palavraRevertida + Character.toString(palavraRecebida.charAt(i));
        }
        System.out.println(palavraRevertida);

    }
}
