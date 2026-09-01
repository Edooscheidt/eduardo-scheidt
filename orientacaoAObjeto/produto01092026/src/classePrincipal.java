public class classePrincipal {

    public static void main(String[] args) {

        produto produto1 = new produto();

        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.50;
        produto1.desconto = 15;

        produto produto2 = new produto();

        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUnitario = 1.20;
        produto2.desconto = 2;

        produto produto3 = new produto();

        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20 cm";
        produto3.precoUnitario = 2.35;
        produto3.desconto = 10;


        System.out.println("           PRODUTO 1");
        System.out.println("========================================");
        System.out.println("Nome:        " + produto1.nome);
        System.out.println("Descrição:   " + produto1.descricao);
        System.out.println("Preço:       R$ " + produto1.precoUnitario);
        System.out.println("Desconto:    " + produto1.desconto + "%");

        System.out.println("========================================");
        System.out.println("           PRODUTO 2");
        System.out.println("Nome:        " + produto2.nome);
        System.out.println("Descrição:   " + produto2.descricao);
        System.out.println("Preço:       R$ " + produto2.precoUnitario);
        System.out.println("Desconto:    " + produto2.desconto + "%");

        System.out.println("========================================");
        System.out.println("           PRODUTO 3");
        System.out.println("Nome:        " + produto3.nome);
        System.out.println("Descrição:   " + produto3.descricao);
        System.out.println("Preço:       R$ " + produto3.precoUnitario);
        System.out.println("Desconto:    " + produto3.desconto + "%");

    }
}