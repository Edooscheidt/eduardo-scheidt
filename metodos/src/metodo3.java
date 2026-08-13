import java.util.Scanner;

public class metodo3 {

    public static void exibirNumeros(int numeros){
        for (int i = 0; i <= 20; i++){
            System.out.println(numeros + i);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número : ");
        int numeros = leitor.nextInt();
        exibirNumeros(numeros);
    }
}
