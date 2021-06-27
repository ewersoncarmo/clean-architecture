package br.cleanarchitecture.escola.aplicacao.aluno;

import br.cleanarchitecture.escola.dominio.aluno.AlunoRepository;

public class MatriculaAluno {

    private AlunoRepository alunoRepository;

    public MatriculaAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void matricula(MatriculaAlunoDTO matriculaAlunoDTO) {
        alunoRepository.matricula(matriculaAlunoDTO.toObject());
    }
}
