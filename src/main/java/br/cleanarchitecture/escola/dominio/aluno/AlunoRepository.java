package br.cleanarchitecture.escola.dominio.aluno;

import java.util.List;

public interface AlunoRepository {

    void matricula(Aluno aluno);

    Aluno buscaPorCpf(CPF cpf);

    List<Aluno> buscaTodos();
}
