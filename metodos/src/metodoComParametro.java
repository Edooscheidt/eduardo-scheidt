public class metodoComParametro {
    public static void main(String[] args) {
        desempenharCalculo(55, 14, 9);
    }


    public static void desempenharCalculo(double num1, double num2, double num3) {
        double resultado = (num1 + num2) * num3;
        System.out.println(resultado);
    }
}
