import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeiraArrayList {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();
        numero.add(50);
        numero.add(45);
        numero.add(35);
        numero.add(30);
        System.out.println("Informe um número : ");
        int verifica = leitor.nextInt();
        int indice = numero.indexOf(verifica);
        if (indice != -1) {
            System.out.println("Número encontrado no índice." + indice);
        } else {
            System.out.println("Número não encontrado.");
        }

        leitor.close();
    }
}
