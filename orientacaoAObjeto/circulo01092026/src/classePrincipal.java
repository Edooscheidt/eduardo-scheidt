public class classePrincipal {

    public static void main(String[] args) {


        circulo c1 = new circulo();
        circulo c2 = new circulo();
        circulo c3 = new circulo();
        circulo c4 = new circulo();


        c1.raio = 1;
        c2.raio = 5;
        c3.raio = 4;
        c4.raio = 2.5;


        System.out.println(c4.calcularArea());

    }

}