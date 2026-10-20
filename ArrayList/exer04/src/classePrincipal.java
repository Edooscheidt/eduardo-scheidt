public class classePrincipal {
    public static void main(String[] args) {

        materiaisDeConstrucao loja = new materiaisDeConstrucao();

        produto p1 = new produto("Vonder", "Furadeira", 250.00, 10);
        produto p2 = new produto("Vonder", "Parafusadeira", 400.00, 5);
        produto p3 = new produto("Tramontina", "Martelo", 50.00, 20);
        produto p4 = new produto("Vonder", "Alicate", 80.00, 15);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);

        p1.adicionarEstoque(5);
        System.out.println("Após adicionar estoque:");
        System.out.println(p1);

        if (p1.venderProduto(3)) {
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }

        System.out.println("Após a venda:");
        System.out.println(p1);

        produto maisCaro = loja.obterProdutoMaisCaro("Vonder");

        if (maisCaro != null) {
            System.out.println("\nProduto mais caro da marca Vonder:");
            System.out.println(maisCaro);
        } else {
            System.out.println("Marca não encontrada.");
        }

        System.out.println("\nProdutos Vonder entre R$ 100 e R$ 300:");

        for (produto produto :
                loja.buscarProdutosPorMarcaEPreco("Vonder", 100, 300)) {
            System.out.println(produto);
        }
    }
}