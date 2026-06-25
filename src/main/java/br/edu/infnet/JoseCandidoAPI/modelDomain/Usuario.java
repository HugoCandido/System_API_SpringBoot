package br.edu.infnet.JoseCandidoAPI.modelDomain;

public abstract class Usuario {

    private Integer id;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    //TODO criaçao do contrutor

    @Override
    public String toString() {
        //TODO atualização do toString
        return String.format(" %d - %s - %s - %s - %s" ,id ,nome, email, cpf, telefone);
    }

    public abstract String obterTipo();

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(Object o){
        this.telefone = telefone;
    }

}
