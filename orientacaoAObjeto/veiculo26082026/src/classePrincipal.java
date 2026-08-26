public class classePrincipal {
    public static void main(String[] args) {

        veiculo v1 = new veiculo();

        v1.marca = "Honda";
        v1.modelo = "Civic";
        v1.placa = "xx1xx13";
        v1.ano = 2010;
        v1.preco = 50.000;

        System.out.println(v1.marca + " " + v1.modelo);


        veiculo v2 = new veiculo();
        v2.marca = "Volkswagem";
        v2.modelo = "Gol";
        v2.placa = "xx2xx13";
        v2.ano = 2013;
        v2.preco = 57.000;

        System.out.printf(v2.marca + " " + v2.modelo);
    }
}
