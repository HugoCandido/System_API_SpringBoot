package br.edu.infnet.JoseCandidoAPI.model.service;

import java.util.List;

public interface CrudService <T,ID>{

    T salvar(T entity);
    T obterPorId(ID id);
    void excluir (ID id);
    List<T> obterList();

}
