package br.cleanarchitecture.escola.academico.aplicacao.aluno;

import br.cleanarchitecture.escola.shared.dominio.evento.EventoPublisher;
import br.cleanarchitecture.escola.academico.dominio.aluno.Aluno;
import br.cleanarchitecture.escola.academico.dominio.aluno.AlunoMatriculadoListener;
import br.cleanarchitecture.escola.shared.dominio.CPF;
import br.cleanarchitecture.escola.academico.infra.aluno.EmMemoriaAlunoRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaAlunoTest {

    @Test
    public void deveMatricularAlunoComSucesso() {
        EmMemoriaAlunoRepository emMemoriaAlunoRepository = new EmMemoriaAlunoRepository();

        EventoPublisher eventoPublisher = new EventoPublisher();
        eventoPublisher.adiciona(new AlunoMatriculadoListener());

        MatriculaAluno matriculaAluno = new MatriculaAluno(emMemoriaAlunoRepository, eventoPublisher);
        matriculaAluno.matricula(new MatriculaAlunoDTO("287.443.960-66", "Aluno", "aluno@gmail.com"));

        Aluno aluno = emMemoriaAlunoRepository.buscaPorCpf(new CPF("287.443.960-66"));

        assertEquals("287.443.960-66", aluno.getCpf());
        assertEquals("Aluno", aluno.getNome());
        assertEquals("aluno@gmail.com", aluno.getEmail());
    }
}