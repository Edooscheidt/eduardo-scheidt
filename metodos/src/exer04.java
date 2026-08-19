import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String inscricaoMaisAlto = "";
        double alturaMaisAlto = 0;

        String inscricaoMaisBaixo = "";
        double alturaMaisBaixo = Double.MAX_VALUE;

        double somaAlturas = 0;
        int totalAtletas = 0;

        String inscricao = "";

        while (!inscricao.equals("0")) {
            System.out.print("Digite o número de inscrição (ou 0 para sair): ");
            inscricao = leitor.nextLine();

            if (!inscricao.equals("0")) {
                System.out.print("Digite a altura do atleta: ");
                double altura = leitor.nextDouble();
                leitor.nextLine();

                totalAtletas++;
                somaAlturas += altura;

                if (altura > alturaMaisAlto) {
                    alturaMaisAlto = altura;
                    inscricaoMaisAlto = inscricao;
                }

                if (altura < alturaMaisBaixo) {
                    alturaMaisBaixo = altura;
                    inscricaoMaisBaixo = inscricao;
                }
            }
        }

        if (totalAtletas > 0) {
            double mediaAlturas = somaAlturas / totalAtletas;

            System.out.println("\nAtleta mais alto - Inscrição : " + inscricaoMaisAlto
                    + " | Altura : " + alturaMaisAlto + "m");

            System.out.println("Atleta mais baixo - Inscrição : " + inscricaoMaisBaixo
                    + " | Altura : " + alturaMaisBaixo + "m");

            System.out.println("Altura média do grupo   : "
                    + String.format("%.2f", mediaAlturas) + "m");

            System.out.println("Quantidade de atletas cadastrados: "
                    + totalAtletas);
        } else {
            System.out.println("\nNenhum atleta foi cadastrado.");
        }

        leitor.close();
    }
}