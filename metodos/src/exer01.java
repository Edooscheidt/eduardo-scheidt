import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 4 : ");
        System.out.println("1 para Verão | 2 para Outono");
        System.out.println("3 para Inverno | 4 para Primavera");
        String estacao = leitor.next();

        leitor.close();
    }
}
