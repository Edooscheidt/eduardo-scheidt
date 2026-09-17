public class ClassePrincipal {

    public static void main(String[] args) {

        ImpostoDeRenda[] contribuintes = new ImpostoDeRenda[5];

        contribuintes[0] = new ImpostoDeRenda("João da Silva", "123.456.789-00", "PR", 40000);
        contribuintes[1] = new ImpostoDeRenda("Maria Souza", "987.654.321-00", "SC", 8000);
        contribuintes[2] = new ImpostoDeRenda("Carlos Oliveira", "111.222.333-44", "RS", 20000);
        contribuintes[3] = new ImpostoDeRenda("Ana Costa", "555.666.777-88", "SC", 30000);
        contribuintes[4] = new ImpostoDeRenda("Pedro Santos", "999.888.777-66", "PR", 3500);

        double maiorImposto = 0;
        String quemPagaMais = "";

        double totalImposto = 0;

        for (int i = 0; i < contribuintes.length; i++) {

            System.out.println("Nome : " + contribuintes[i].getNome());
            System.out.println("CPF : " + contribuintes[i].getCpf());
            System.out.println("UF : " + contribuintes[i].getUf());
            System.out.printf("Renda anual : R$ %.2f%n", contribuintes[i].getRendaAnual());
            System.out.printf("Imposto a pagar : R$ %.2f%n", contribuintes[i].calcularImposto());
            System.out.println("<----------------------------->");

            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                quemPagaMais = contribuintes[i].getNome();
            }

            totalImposto += contribuintes[i].calcularImposto();
        }

        System.out.println();
        System.out.println("a) Quem mais paga imposto:");
        System.out.printf("%s - R$ %.2f%n", quemPagaMais, maiorImposto);

        System.out.println();
        System.out.println("b) Total de imposto pago pelos 5 contribuintes:");
        System.out.printf("R$ %.2f%n", totalImposto);
    }
}