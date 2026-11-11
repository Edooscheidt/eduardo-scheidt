public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;

    public Endereco(String uf, String cidade, String cep, String logradouro, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + " - " + cidade + "/" + uf + " - CEP: " + cep;
    }
}