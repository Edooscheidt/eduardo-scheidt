import java.util.ArrayList;

public class ClassePrincipal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Endereco e1 = new Endereco("SC", "Blumenau", "89000-001", "Praça Victor Konder", 2);
        Endereco e2 = new Endereco("SP", "São Paulo", "01000-000", "Viaduto do Chá", 15);
        Endereco e3 = new Endereco("PR", "Curitiba", "80000-001", "Av. Cândido de Abreu", 817);

        pessoas.add(new Pessoa("Eduardo Scheidt", e1));
        pessoas.add(new Pessoa("Diogo Bennertz", e2));
        pessoas.add(new Pessoa("Patrick Velho", e3));

        System.out.println("=== Lista de Pessoas ===");
        for (Pessoa p : pessoas) {
            System.out.println(p);
            System.out.println("------------------------");
        }
    }
}