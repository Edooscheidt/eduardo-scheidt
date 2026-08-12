import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 4 :");
        int numero = leitor.nextInt();

        if (numero == 1) {
            verificaVerao();
        } else if (numero == 2) {
            verificaOutono();
        } else if (numero == 3) {
            verificaInverno();
        } else if (numero == 4) {
            verificaPrimavera();
        } else {
            System.out.println("Número inválido.");
        }

        leitor.close();
    }

    public static void verificaVerao() {
        System.out.println("É verão");
        System.out.println("O tempo está quente");
    }

    public static void verificaOutono() {
        System.out.println("É outono");
        System.out.println("O tempo está ameno");
    }

    public static void verificaInverno() {
        System.out.println("É inverno");
        System.out.println("O tempo está frio");
    }

    public static void verificaPrimavera() {
        System.out.println("É primavera");
        System.out.println("O tempo está agradável");
    }
}