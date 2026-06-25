package br.edu.infnet.JoseCandidoAPI.model.service;

import br.edu.infnet.JoseCandidoAPI.modelDomain.Aluno;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Endereco;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Exceptions.AlunoInvalidoException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AlunoService implements CrudService<Aluno, Integer>{


 private final Map<Integer, Aluno> mapa = new ConcurrentHashMap<Integer, Aluno>();
 private final AtomicInteger nextId = new AtomicInteger(1);

    @Override
    public Aluno salvar(Aluno aluno) {

        if(aluno.getNome() == null){
            throw new AlunoInvalidoException("O nome do aluno é obrigatorio");
        }

        aluno.setId(nextId.getAndIncrement());
        mapa.put(aluno.getId(), aluno);

        return aluno;
    }

    @Override
    public void excluir(Integer id) {
        mapa.remove(id);
    }

    @Override
    public  List<Aluno> obterList() {

        return new ArrayList<Aluno>(mapa.values());
    }

    @Override
    public Aluno obterPorId(Integer id) {

        Aluno aluno = mapa.get(id);

        if(aluno == null){
           throw new  IllegalArgumentException("Impossivel obter o aluno pelo ID" + id);
        }

        return aluno;
    }

}
