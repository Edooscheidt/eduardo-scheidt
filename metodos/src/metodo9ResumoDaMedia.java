import java.util.Scanner;

public class metodo9ResumoDaMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int numero = leitor.nextInt();

        System.out.println(determinaparImpar(numero));
    }

    public static boolean determinaparImpar(int num) {
        return (num % 2 == 0);

    }

}
