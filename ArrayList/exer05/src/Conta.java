public class Conta {

    private String nomeTitular;
    private double saldo;

    private static final double TAXA_JUROS_MENSAL = 0.01;

    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (destino == null) {
            System.out.println("Conta de destino inválida.");
        } else if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.printf("Transferência de R$ %.2f de %s para %s realizada com sucesso.%n",
                    valor, this.nomeTitular, destino.nomeTitular);
        }
    }

    public double simularInvestimento(double valor, int meses) {
        if (valor <= 0 || meses < 0) {
            System.out.println("Valor ou tempo de investimento inválido.");
            return 0;
        }
        return valor * Math.pow(1 + TAXA_JUROS_MENSAL, meses);
    }
}