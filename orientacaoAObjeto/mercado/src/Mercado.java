
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

    @Override
    public String toString() {
        return "Mercado{" +
                "nomeMercado='" + nomeMercado + '\'' +
                ", macasVendidas=" + macasVendidas +
                ", precoMaca=" + precoMaca +
                ", laranjasVendidas=" + laranjasVendidas +
                ", precoLaranja=" + precoLaranja +
                '}';
    }

    public double calcularReceitaTotal() {
        // return (macasVendidas * precoMaca) + (laranjasVendidas * precoLaranja);
        return calcularReceitaMacas() + calcularReceitaLaranjas();



    }

}