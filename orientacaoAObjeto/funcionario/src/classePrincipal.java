public class classePrincipal {

    public static void main(String[] args) {

        funcionario f1 = new funcionario();

        f1.identificacao = "984841584185";
        f1.nome = "João";
        f1.sobrenome = "Santos";
        f1.salario = 5000;

        System.out.println(f1.calcularSalarioAnual());

        System.out.println(f1.obterNomeCompleto());


        f1.aumentarSalario(5);


        System.out.println(f1.salario);
    }

}