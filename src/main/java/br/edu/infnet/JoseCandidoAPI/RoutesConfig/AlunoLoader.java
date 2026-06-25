package br.edu.infnet.JoseCandidoAPI.RoutesConfig;

import br.edu.infnet.JoseCandidoAPI.model.service.AlunoService;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Aluno;
import br.edu.infnet.JoseCandidoAPI.modelDomain.Endereco;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class AlunoLoader implements ApplicationRunner {


    private final AlunoService alunoService;
    public AlunoLoader(AlunoService alunoService){
        this.alunoService = alunoService;
    }

@Override
    public void run(ApplicationArguments args) throws Exception {
//para ler um arquivo com dados
    InputStream input = getClass().getClassLoader().getResourceAsStream("Database.txt");

    if (input == null) {
        throw new RuntimeException("Arquivo NÃO encontrado!");
    }

    BufferedReader leitura = new BufferedReader(new InputStreamReader(input));
    String linha;

    Aluno aluno = null;
    while ((linha = leitura.readLine()) != null) {

        String[] campos = linha.split(";");


        Endereco endereco = new Endereco();
        endereco.setCep(campos[7]);
        endereco.setLocalidade(campos[8]);

        aluno = new Aluno();
        aluno.setNome(campos[0]);
        aluno.setMatricula(Integer.parseInt(campos[1]));
        aluno.setPeso(Double.parseDouble(campos[2]));
        aluno.setAtivo(Boolean.parseBoolean(campos[3]));
        aluno.setCpf(campos[4]);
        aluno.setEmail(campos[5]);
        aluno.setTelefone(campos[6]);

        aluno.setEndereco(endereco);


        alunoService.salvar(aluno);
        System.out.println(aluno);
    }
    System.out.println(" - " + alunoService.obterList().size());


}
}
