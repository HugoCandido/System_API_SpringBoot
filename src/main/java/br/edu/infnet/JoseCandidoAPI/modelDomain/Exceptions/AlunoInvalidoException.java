package br.edu.infnet.JoseCandidoAPI.modelDomain.Exceptions;

public class AlunoInvalidoException extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public AlunoInvalidoException(String mensagem){
        super(mensagem);
    }

}
