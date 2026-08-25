import java.util.Scanner;

public class metodo9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int numero = leitor.nextInt();

        System.out.println(determinaparImpar(numero));
    }
    public static boolean determinaparImpar(int num){
        if (num % 2 == 0){
            return true;
        } else
        {
            return false;
        }
    }

}
