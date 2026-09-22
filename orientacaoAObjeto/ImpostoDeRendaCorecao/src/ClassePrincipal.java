
public class ClassePrincipal {

    public static void main(String[] args) {

        ImpostoDeRenda c1 = new ImpostoDeRenda("João", "00000000000", "SC", 2800);
        ImpostoDeRenda c2 = new ImpostoDeRenda("Maria", "11111111111", "PR", 5000);
        ImpostoDeRenda c3 = new ImpostoDeRenda("Ana", "22222222222", "RS", 10000);
        ImpostoDeRenda c4 = new ImpostoDeRenda("Carlos", "33333333333", "PR", 27000);
        ImpostoDeRenda c5 = new ImpostoDeRenda("Jorge", "44444444444", "SC", 38000);

        ImpostoDeRenda[] contribuintes = { c1, c2, c3, c4, c5 };

        // Quem mais paga imposto
        double maiorImposto = 0;
        ImpostoDeRenda contribuinteMaiorImposto = null;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                contribuinteMaiorImposto = contribuintes[i];
            }
        }
        System.out.println(contribuinteMaiorImposto);

        // Qual o total de imposto pago entre os 5 contribuintes
        double totalImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            totalImposto += contribuintes[i].calcularImposto();
        }
        System.out.println("O total de imposto pago é de R$" + totalImposto);

    }

}