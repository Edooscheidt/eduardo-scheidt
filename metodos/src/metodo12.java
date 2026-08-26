import java.util.Scanner;

public class metodo12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe uma palavra : ");
        String palavra = leitor.next();
        System.out.println(obterCaracter(palavra));
    }

    public static char obterCaracter(String palavra) {
        // return palavra.length() % 2 == 0 ? palavra.charAT(0) : palavra.charAT(1);
        if (palavra.length() % 2 == 0) {
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }

}
