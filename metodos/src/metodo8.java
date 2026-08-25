import java.util.Scanner;

public class metodo8 {

    public static double calculaMedia(double nota1, double nota2, double nota3) {

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            return 0;
        }

        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a 1ª nota : ");
        double nota1 = leitor.nextDouble();

        System.out.print("Informe a 2ª nota : ");
        double nota2 = leitor.nextDouble();

        System.out.print("Informe a 3ª nota : ");
        double nota3 = leitor.nextDouble();

        double media = calculaMedia(nota1, nota2, nota3);

        System.out.println("A sua média é : " + media);


    }
}