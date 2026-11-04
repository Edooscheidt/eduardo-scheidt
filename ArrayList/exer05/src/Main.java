public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Diogo", 1000.00);
        Conta c2 = new Conta("Eduardo", 500.00);

        c1.depositar(200);
        c1.depositar(-50);
        c1.sacar(300);
        c1.sacar(5000);

        c1.transferir(c2, 400);
        c1.transferir(c2, 10000);

        System.out.printf("Saldo de %s: R$ %.2f%n", c1.getNomeTitular(), c1.getSaldo());
        System.out.printf("Saldo de %s: R$ %.2f%n", c2.getNomeTitular(), c2.getSaldo());

        double montante = c1.simularInvestimento(1000, 12);
        System.out.printf("Montante após 12 meses: R$ %.2f%n", montante);
    }
}