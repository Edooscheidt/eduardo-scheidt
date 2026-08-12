import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu peso em kg: ");
        double peso = leitor.nextDouble();

        System.out.print("Informe sua altura em metros: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau 2");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grau 3 (Mórbida)");
        }

        leitor.close();
    }
}