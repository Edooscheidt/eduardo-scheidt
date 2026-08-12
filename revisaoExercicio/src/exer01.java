import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu número de matricula : ");
        String matricula = leitor.next();
        System.out.println("Informe seu nome : ");
        String nome = leitor.next();
        System.out.println("Informe as suas horas trabalhadas : ");
        int horaTrabalhada = leitor.nextInt();
        System.out.println("Informe o valor da hora trabalhada : ");
        double valorHora = leitor.nextDouble();
        double salario = (valorHora * horaTrabalhada) * 4;

        System.out.println("Matricula: " + matricula + " Nome: " + nome + " Salário: " + salario);


        leitor.close();
    }
}
