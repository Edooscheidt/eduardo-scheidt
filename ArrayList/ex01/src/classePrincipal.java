public class classePrincipal {

    public static retangulo maiorArea(retangulo[] retangulos) {

        retangulo maior = retangulos[0];

        for (int i = 1; i < retangulos.length; i++) {
            if (retangulos[i].calcularArea() > maior.calcularArea()) {
                maior = retangulos[i];
            }
        }

        return maior;
    }

    public static retangulo maiorPerimetro(retangulo[] retangulos) {

        retangulo maior = retangulos[0];

        for (int i = 1; i < retangulos.length; i++) {
            if (retangulos[i].calcularPerimetro() > maior.calcularPerimetro()) {
                maior = retangulos[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        retangulo r1 = new retangulo(10, 5);
        retangulo r2 = new retangulo(8, 8);
        retangulo r3 = new retangulo(12, 6);
        retangulo r4 = new retangulo(15, 4);

        retangulo[] retangulos = {r1, r2, r3, r4};

        System.out.println("Retângulo com maior área:");
        System.out.println(maiorArea(retangulos));

        System.out.println();

        System.out.println("Retângulo com maior perímetro:");
        System.out.println(maiorPerimetro(retangulos));
    }
}