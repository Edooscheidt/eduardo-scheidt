
public class Aeronave {

    String modelo;

    int qtdPassageiros;

    double velMax;

    double capCombustivel;

    double queimaMinuto;

    /**
     * Construtor completo para inicializar todos os atributos da aeronave.
     *
     * @param modelo         O modelo da aeronave.
     * @param qtdPassageiros A quantidade de passageiros suportada.
     * @param velMax         A velocidade máxima da aeronave.
     * @param capCombustivel A capacidade total de combustível.
     * @param queimaMinuto   O consumo de combustível por minuto.
     */
    public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaMinuto) {
        this.modelo = modelo;
        this.qtdPassageiros = qtdPassageiros;
        this.velMax = velMax;
        this.capCombustivel = capCombustivel;
        this.queimaMinuto = queimaMinuto;
    }

    /**
     * Calcula a autonomia da aeronave em minutos de voo. O cálculo é baseado na
     * capacidade total do tanque dividida pelo consumo por minuto.
     *
     * @return O tempo total de autonomia em minutos.
     */
    public double calcularAutonomia() {
        return capCombustivel / queimaMinuto;
    }

    /**
     * Calcula a distância máxima que a aeronave consegue percorrer. O cálculo
     * utiliza o tempo de autonomia multiplicado pela velocidade máxima.
     *
     * @return A distância máxima alcançável (geralmente em quilômetros).
     */
    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velMax;
    }

    /**
     * Retorna uma representação em texto com todos os dados da aeronave.
     *
     * @return Uma string contendo os valores de todos os atributos da classe.
     */
    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
                + ", capCombustivel=" + capCombustivel + ", queimaMinuto=" + queimaMinuto + "]";
    }

}