public class Main {
    public static void main(String[] args) {

        veiculo v1 = new veiculo("Honda", "Civic", "ABC-1234", 2023, 120000.00);

        System.out.println(v1);

        v1.setPreco(115000.00);

        System.out.println("Placa: " + v1.getPlaca() + " | Novo Preço: R$ " + v1.getPreco());
    }
}
