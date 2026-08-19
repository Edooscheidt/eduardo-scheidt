import java.util.Scanner;

public class metodo7 {

    public static String verao() {
        return "É verão e o tempo está quente.";
    }

    public static String outono() {
        return "É outono e o tempo está ameno.";
    }

    public static String inverno() {
        return "É inverno e está frio.";
    }

    public static String primavera() {
        return "É primavera e o tempo está agradável.";
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 4 :");
        int numero = leitor.nextInt();

        if (numero == 1) {
            System.out.println(verao());
        } else if (numero == 2) {
            System.out.println(outono());
        } else if (numero == 3) {
            System.out.println(inverno());
        } else if (numero == 4) {
            System.out.println(primavera());
        } else {
            System.out.println("Número inválido.");
        }

        leitor.close();
    }
}