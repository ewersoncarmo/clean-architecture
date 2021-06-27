package br.cleanarchitecture.escola;

import br.cleanarchitecture.escola.aplicacao.aluno.MatriculaAluno;
import br.cleanarchitecture.escola.aplicacao.aluno.MatriculaAlunoDTO;
import br.cleanarchitecture.escola.infra.aluno.EmMemoriaAlunoRepository;

public class MatriculaAlunoCommandLine {

    public static void main(String[] args) {
        MatriculaAluno matriculaAluno = new MatriculaAluno(new EmMemoriaAlunoRepository());
        matriculaAluno.matricula(new MatriculaAlunoDTO("287.443.960-66", "Aluno", "aluno@gmail.com"));
    }
}
