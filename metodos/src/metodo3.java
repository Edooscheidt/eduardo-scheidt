import java.util.Scanner;

public class metodo3 {

    public static void numeros(int numero) {
        System.out.println("Número informado : " + numero);

        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + i);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número :");
        int numero = leitor.nextInt();

        numeros(numero);


    }
}