
public class Mercado {

    String nomeMercado;

    int macasVendidas;

    double precoMaca;

    int laranjasVendidas;

    double precoLaranja;


    public Mercado(String nomeMercado, int macasVendidas, double precoMaca, int laranjasVendidas, double precoLaranja) {
        this.nomeMercado = nomeMercado;
        this.macasVendidas = macasVendidas;
        this.precoMaca = precoMaca;
        this.laranjasVendidas = laranjasVendidas;
        this.precoLaranja = precoLaranja;
    }

    public double calcularReceitaMacas() {
        return macasVendidas * precoMaca;
    }

    public double calcularReceitaLaranjas() {
        return laranjasVendidas * precoLaranja;
    }

    public double calcularReceitaTotal() {
        // return (macasVendidas * precoMaca) + (laranjasVendidas * precoLaranja);
        return calcularReceitaMacas() + calcularReceitaLaranjas();
    }

}