import java.util.Scanner;

public class metodo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numero = new int[3];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número : ");
            numero[i] = leitor.nextInt();
        }

        leitor.close();

        int maior = numero[0];
        int menor = numero[0];
        double soma = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }

            if (numero[i] < menor) {
                menor = numero[i];
            }

            soma += numero[i];
        }

        double media = soma / numero.length;

        System.out.println("Maior elemento : " + maior);
        System.out.println("Menor elemento : " + menor);
        System.out.println("Média dos elementos : " + media);

        leitor.close();

    }
}