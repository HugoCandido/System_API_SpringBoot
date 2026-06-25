package br.edu.infnet.JoseCandidoAPI.modelDomain;

public class Aluno extends Usuario{

    private Integer id;

    //public String nome; //excluido temporariamente
    private int matricula;
    private double peso;
    private boolean ativo;
    private Endereco endereco;

    //TODO construtor do Aluno

    @Override
    public String toString() {
        return String.format(" %s- %d - %.2f - %s - %s",
                super.toString(),
                matricula,
                peso,
                ativo ? "ATIVO" : "DESATIVADO",
                endereco.toString());
        //"Aluno(a) "+nome+", de matricula "+matricula+", está ativa na academia ? "+ativo+"! segue o peso atual para informação: "+peso+" ";
    }

    @Override
    public String obterTipo() {
        return "Aluno";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
