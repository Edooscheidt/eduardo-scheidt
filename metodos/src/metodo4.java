import java.util.Scanner;

public class metodo4 {

    public static int maior(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static double media(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número :");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Maior elemento : " + maior(vetor));
        System.out.println("Menor elemento : " + menor(vetor));
        System.out.println("Média dos valores : " + media(vetor));

        leitor.close();
    }
}