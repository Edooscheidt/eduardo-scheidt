import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome : ");
        String nome = leitor.next();
        System.out.println("Informe seu salário fixo : ");
        double salario = leitor.nextDouble();
        System.out.println("Informe seu total de vendas no mês R$ : ");
        double vendasMes = leitor.nextDouble();
        double totalVendas = (vendasMes * 0.15);
        double salFinal = (salario + totalVendas);

        System.out.println("O total a receber no final do mês será de : R$ " + salFinal);


        leitor.close();
    }
}
