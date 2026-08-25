import java.util.Scanner;

public class metodo1 {

    public static void verao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente");
    }

    public static void outono() {
        System.out.println("É outono");
        System.out.println("E o tempo está ameno");
    }

    public static void inverno() {
        System.out.println("É inverno");
        System.out.println("E está frio");
    }

    public static void primavera() {
        System.out.println("É primavera");
        System.out.println("E o tempo está agradável");
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 4 : ");
        int numero = leitor.nextInt();

        if (numero == 1) {
            verao();
        } else if (numero == 2) {
            outono();
        } else if (numero == 3) {
            inverno();
        } else if (numero == 4) {
            primavera();
        } else {
            System.out.println("Número inválido!");
        }


    }
}