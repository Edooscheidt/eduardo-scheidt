public class classePrincipal {


    public static void main(String[] args) {

        mercado unidadeDeBlumenau = new mercado();
        mercado unidadeDeJoinville = new mercado();
        mercado unidadeDeFlorianopolis = new mercado();
        unidadeDeBlumenau.nome = "Mercado de Blumenau";
        unidadeDeFlorianopolis.nome = "Mercado de Florianópolis";
        unidadeDeJoinville.nome = "Mercado de Joinville";
        unidadeDeBlumenau.numLaranjas = 3;
        unidadeDeFlorianopolis.numLaranjas = 7;
        unidadeDeJoinville.numLaranjas = 5;
        unidadeDeBlumenau.precoLaranjas = 4.50;
        unidadeDeJoinville.precoLaranjas = 2.75;
        unidadeDeFlorianopolis.precoLaranjas = 3.00;
        unidadeDeBlumenau.precoMacas = 2.50;
        unidadeDeFlorianopolis.precoMacas = 4.50;
        unidadeDeJoinville.precoMacas = 4.75;
        unidadeDeBlumenau.numMacas = 4;
        unidadeDeFlorianopolis.numMacas = 7;
        unidadeDeJoinville.numMacas = 2;

        System.out.println("Unidade : " + unidadeDeBlumenau.nome);
        System.out.println("Laranjas - Qtd : " + unidadeDeBlumenau.numLaranjas + " | Preço : R$" + unidadeDeBlumenau.precoLaranjas);
        System.out.println("Maçãs    - Qtd : " + unidadeDeBlumenau.numMacas + " | Preço : R$" + unidadeDeBlumenau.precoMacas);
        System.out.println("</----------------------------------------/>");

        System.out.println("Unidade : " + unidadeDeFlorianopolis.nome);
        System.out.println("Laranjas - Qtd : " + unidadeDeFlorianopolis.numLaranjas + " | Preço : R$" + unidadeDeFlorianopolis.precoLaranjas);
        System.out.println("Maçãs    - Qtd : " + unidadeDeFlorianopolis.numMacas + " | Preço : R$" + unidadeDeFlorianopolis.precoMacas);
        System.out.println("</----------------------------------------/>");

        System.out.println("Unidade : " + unidadeDeJoinville.nome);
        System.out.println("Laranjas - Qtd : " + unidadeDeJoinville.numLaranjas + " | Preço : R$" + unidadeDeJoinville.precoLaranjas);
        System.out.println("Maçãs    - Qtd : " + unidadeDeJoinville.numMacas + " | Preço : R$" + unidadeDeJoinville.precoMacas);

    }

}