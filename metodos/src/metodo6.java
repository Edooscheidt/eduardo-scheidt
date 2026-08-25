import java.util.Scanner;

public class metodo6 {

    public static String generateStarWarsName(String nome, String sobrenome,
                                              String sobrenomeMae, String cidade) {

        String primeiroNome = sobrenome.substring(0, 3) + nome.substring(0, 2);

        String segundoNome = sobrenomeMae.substring(0, 2) + cidade.substring(0, 3);

        return primeiroNome + " " + segundoNome;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu nome : ");
        String nome = leitor.nextLine();

        System.out.print("Informe seu sobrenome : ");
        String sobrenome = leitor.nextLine();

        System.out.print("Informe o sobrenome de solteira da sua mãe : ");
        String sobrenomeMae = leitor.nextLine();

        System.out.print("Informe a cidade onde você nasceu : ");
        String cidade = leitor.nextLine();

        String nomeStarWars = generateStarWarsName(
                nome, sobrenome, sobrenomeMae, cidade
        );

        System.out.println("Seu nome Star Wars é : " + nomeStarWars);


    }
}