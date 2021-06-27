package br.cleanarchitecture.escola.infra.aluno;

import br.cleanarchitecture.escola.dominio.aluno.Aluno;
import br.cleanarchitecture.escola.dominio.aluno.AlunoNaoEncontradoException;
import br.cleanarchitecture.escola.dominio.aluno.AlunoRepository;
import br.cleanarchitecture.escola.dominio.aluno.CPF;

import java.util.ArrayList;
import java.util.List;

public class EmMemoriaAlunoRepository implements AlunoRepository {

    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void matricula(Aluno aluno) {
        System.out.println("Matriculando aluno em memória " + aluno);
        alunos.add(aluno);
    }

    @Override
    public Aluno buscaPorCpf(CPF cpf) {
        System.out.println("Buscando aluno por CPF em memória " + cpf.getNumero());
        return alunos.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf.getNumero()));
    }

    @Override
    public List<Aluno> buscaTodos() {
        System.out.println("Buscanco todos os alunos em memória");
        return alunos;
    }
}
