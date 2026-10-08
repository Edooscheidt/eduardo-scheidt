public class flor {

    private String nome;
    private double preco;
    private String cliente;

    public flor(String nome, double preco, String cliente) {
        this.nome = nome;
        this.preco = preco;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Flor: " + nome + ", Preço: R$ " + preco + ", Cliente: " + cliente;
    }
}