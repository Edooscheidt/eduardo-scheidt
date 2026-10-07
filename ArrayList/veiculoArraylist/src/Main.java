public class Main {
    public static void main(String[] args) {
        // Criando um veículo com todos os novos dados
        veiculo v1 = new veiculo("Honda", "Civic", "ABC-1234", 2023, 120000.00);

        // Exibindo os dados estruturados pelo toString
        System.out.println(v1);
        // Saída: Veiculo {Marca: 'Honda', Modelo: 'Civic', Placa: 'ABC-1234', Ano: 2023, Preço: R$ 120000,00}

        // Alterando o preço usando o Setter
        v1.setPreco(115000.00);

        // Exibindo apenas a placa e o novo preço usando os Getters
        System.out.println("Placa: " + v1.getPlaca() + " | Novo Preço: R$ " + v1.getPreco());
    }
}
