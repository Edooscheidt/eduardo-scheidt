import java.util.Scanner;

public class metodo5 {

    public static void comparar(int base, int numero1, int numero2) {

        int distancia1 = Math.abs(base - numero1);
        int distancia2 = Math.abs(base - numero2);

        if (distancia1 < distancia2) {
            System.out.println("O número " + numero1 + " está mais perto da base.");
        } else if (distancia2 < distancia1) {
            System.out.println("O número " + numero2 + " está mais perto da base.");
        } else {
            System.out.println("Os dois números estão à mesma distância da base.");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número base :");
        int base = leitor.nextInt();

        System.out.println("Informe o primeiro número :");
        int numero1 = leitor.nextInt();

        System.out.println("Informe o segundo número :");
        int numero2 = leitor.nextInt();

        comparar(base, numero1, numero2);

        leitor.close();
    }
}