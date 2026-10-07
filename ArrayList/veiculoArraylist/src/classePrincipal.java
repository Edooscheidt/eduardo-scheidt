public class classePrincipal {
    public static void main(String[] args) {

        veiculo v1 = new veiculo("Honda", "Civic", "XXX1X13", 2010, 45000);
        veiculo v2 = new veiculo("Mazda", "Mx3", "XXX2X13", 1997, 50000);
        veiculo v3 = new veiculo("Fiat", "Strada", "XXX3X13", 1996, 35000);
        veiculo v4 = new veiculo("Fiat", "Palio", "XXX4X13", 2009, 30000);
        veiculo v5 = new veiculo("Volkswagen", "Gol", "XXX5X13", 2012, 28000);
        veiculo v6 = new veiculo("Chevrolet", "Onix", "XXX6X13", 2015, 42000);
        veiculo v7 = new veiculo("Toyota", "Corolla", "XXX7X13", 2018, 75000);
        veiculo v8 = new veiculo("Ford", "Ka", "XXX8X13", 2011, 27000);

        concessionaria c1 = new concessionaria();
        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);
        c1.adicionarVeiculo(v3);
        c1.adicionarVeiculo(v4);

        System.out.println(c1.obterVeiculoMaisBarato());

        concessionaria c2 = new concessionaria();
        c2.adicionarVeiculo(v5);
        c2.adicionarVeiculo(v6);
        c2.adicionarVeiculo(v7);
        c2.adicionarVeiculo(v8);

        System.out.println(c2.obterVeiculoMaisBarato());
    }
}
