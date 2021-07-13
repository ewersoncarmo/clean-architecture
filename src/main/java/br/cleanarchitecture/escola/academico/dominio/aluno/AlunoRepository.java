package br.cleanarchitecture.escola.academico.dominio.aluno;

import br.cleanarchitecture.escola.shared.dominio.CPF;

import java.util.List;

public interface AlunoRepository {

    void matricula(Aluno aluno);

    Aluno buscaPorCpf(CPF cpf);

    List<Aluno> buscaTodos();
}
