public class produto {
    private final String marca;
    private final String modelo;
    private final double preco;
    private int quantidadeEstoque;

    public produto(String marca, String modelo, double preco, int quantidadeEstoque) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        }
    }

    public boolean venderProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    @Override
    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Preço: R$ %.2f, Estoque: %d",
                marca, modelo, preco, quantidadeEstoque);
    }
}