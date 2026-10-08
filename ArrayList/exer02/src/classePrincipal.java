public class classePrincipal {

    public static void main(String[] args) {

        flor f1 = new flor("Rosa", 10, "Diogo");
        flor f2 = new flor("Girassol", 15, "Maria");
        flor f3 = new flor("Orquídea", 30, "Diogo");
        flor f4 = new flor("Tulipa", 12, "João");
        flor f5 = new flor("Lírio", 20, "Diogo");

        floricultura floricultura = new floricultura();

        floricultura.adicionarFlor(f1);
        floricultura.adicionarFlor(f2);
        floricultura.adicionarFlor(f3);
        floricultura.adicionarFlor(f4);
        floricultura.adicionarFlor(f5);

        System.out.println("Flores compradas pelo Diogo:");

        for (flor flor : floricultura.floresDoCliente("Diogo")) {
            System.out.println(flor);
        }
    }
}