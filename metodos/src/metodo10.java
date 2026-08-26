import java.util.Scanner;

public class metodo10 {

    public static boolean estaNosLimites(int numero, int minimo, int maximo) {
        return numero >= minimo && numero <= maximo;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o limite mínimo : ");
        int minimo = leitor.nextInt();

        System.out.print("Informe o limite máximo : ");
        int maximo = leitor.nextInt();

        System.out.print("Informe um número : ");
        int numero = leitor.nextInt();

        if (estaNosLimites(numero, minimo, maximo)) {
            System.out.println(numero + " está nos limites impostos.");
        } else {
            System.out.println(numero + " não está nos limites impostos.");
        }

        leitor.close();
    }
}