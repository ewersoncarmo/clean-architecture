package br.cleanarchitecture.escola.infra.aluno;

import br.cleanarchitecture.escola.dominio.aluno.Aluno;
import br.cleanarchitecture.escola.dominio.aluno.AlunoRepository;
import br.cleanarchitecture.escola.dominio.aluno.CPF;

import java.util.List;

public class JpaAlunoRepository implements AlunoRepository {

    @Override
    public void matricula(Aluno aluno) {
        System.out.println("Matriculando aluno no banco de dados " + aluno);
    }

    @Override
    public Aluno buscaPorCpf(CPF cpf) {
        System.out.println("Buscando aluno por CPF no banco de dados " + cpf.getNumero());
        return null;
    }

    @Override
    public List<Aluno> buscaTodos() {
        System.out.println("Buscanco todos os alunos no banco de dados");
        return null;
    }
}
