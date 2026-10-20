import java.util.ArrayList;

public class materiaisDeConstrucao {
    private ArrayList<produto> produtos = new ArrayList<>();

    public void adicionarProduto(produto produto) {
        produtos.add(produto);
    }

    public produto obterProdutoMaisCaro(String marca) {
        produto maisCaro = null;

        for (produto produto : produtos) {
            if (produto.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || produto.getPreco() > maisCaro.getPreco()) {
                    maisCaro = produto;
                }
            }
        }

        return maisCaro;
    }

    public ArrayList<produto> buscarProdutosPorMarcaEPreco(
            String marca, double x, double y) {

        ArrayList<produto> encontrados = new ArrayList<>();

        for (produto produto : produtos) {
            if (produto.getMarca().equalsIgnoreCase(marca)
                    && produto.getPreco() >= x
                    && produto.getPreco() <= y) {
                encontrados.add(produto);
            }
        }

        return encontrados;
    }
}