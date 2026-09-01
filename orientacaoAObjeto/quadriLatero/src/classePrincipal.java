public class classePrincipal {

    public static void main(String[] args) {

        quadrilatero q1 = new quadrilatero();

        q1.altura = 7;
        q1.largura = 8;

        quadrilatero q2 = new quadrilatero();

        q2.altura = 9;
        q2.largura = 2;

        System.out.println(q2.obterPerimetro());

    }

}