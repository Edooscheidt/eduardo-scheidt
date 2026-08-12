public class exer06 {
    public static void main(String[] args) {

        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };

        double somaPrecos = 0;
        int menorPreco = matriz[0][2];

        int maiorQuarto = matriz[0][1];
        int menorQuarto = matriz[0][1];
        int tamanhoMaiorQuarto = matriz[0][0];
        int tamanhoMenorQuarto = matriz[0][0];

        double somaTamanhos = 0;
        int quantidadeCasas = 0;

        for (int i = 0; i < matriz.length; i++) {

            int tamanho = matriz[i][0];
            int quartos = matriz[i][1];
            int preco = matriz[i][2];

            somaPrecos += preco;

            if (preco < menorPreco) {
                menorPreco = preco;
            }

            if (quartos > maiorQuarto) {
                maiorQuarto = quartos;
                tamanhoMaiorQuarto = tamanho;
            }

            if (quartos < menorQuarto) {
                menorQuarto = quartos;
                tamanhoMenorQuarto = tamanho;
            }

            if (preco > 300000) {
                somaTamanhos += tamanho;
                quantidadeCasas++;
            }
        }

        double mediaPrecos = somaPrecos / matriz.length;
        int diferencaTamanho = tamanhoMaiorQuarto - tamanhoMenorQuarto;
        double mediaTamanhos = somaTamanhos / quantidadeCasas;

        System.out.printf("Média dos preços : R$ %.2f%n", mediaPrecos);
        System.out.printf("Menor preço : R$ %.2f%n", (double) menorPreco);
        System.out.println("Diferença de tamanho : " + diferencaTamanho + " m²");
        System.out.printf("Média do tamanho das casas acima de R$ 300.000 : %.2f m²%n",
                mediaTamanhos);
    }
}