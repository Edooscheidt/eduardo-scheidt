public class Main {
    public static void main(String[] args) {

        conta conta1 = new conta("Eduardo", 1612);
        conta conta2 = new conta("Diogo", 1612);

        conta1.sacar(100);
        conta1.depositar(200);
        conta1.transferir(conta2, 300);

        double montante = conta1.simularInvestimento(1000, 12);

        System.out.println("Titular: " + conta1.getNomeTitular());
        System.out.println("Saldo da conta 1: R$ " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: R$ " + conta2.getSaldo());
        System.out.printf("Montante do investimento: R$ %.2f%n", montante);
    }
}