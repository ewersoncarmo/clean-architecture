package br.cleanarchitecture.escola.academico.aplicacao.aluno;

import br.cleanarchitecture.escola.shared.dominio.evento.EventoPublisher;
import br.cleanarchitecture.escola.academico.dominio.aluno.Aluno;
import br.cleanarchitecture.escola.academico.dominio.aluno.AlunoMatriculadoEvento;
import br.cleanarchitecture.escola.academico.dominio.aluno.AlunoRepository;
import br.cleanarchitecture.escola.shared.dominio.CPF;

public class MatriculaAluno {

    private AlunoRepository alunoRepository;
    private EventoPublisher eventoPublisher;

    public MatriculaAluno(AlunoRepository alunoRepository, EventoPublisher eventoPublisher) {
        this.alunoRepository = alunoRepository;
        this.eventoPublisher = eventoPublisher;
    }

    public void matricula(MatriculaAlunoDTO matriculaAlunoDTO) {
        Aluno aluno = matriculaAlunoDTO.toObject();
        alunoRepository.matricula(aluno);

        eventoPublisher.publica(new AlunoMatriculadoEvento(new CPF(aluno.getCpf())));
    }
}
