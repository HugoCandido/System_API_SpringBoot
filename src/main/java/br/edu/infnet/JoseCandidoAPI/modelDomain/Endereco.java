package br.edu.infnet.JoseCandidoAPI.modelDomain;

public class Endereco {

    private String cep;
    private String localidade;

    @Override
    public String toString() {
        return cep + " - " + localidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}
