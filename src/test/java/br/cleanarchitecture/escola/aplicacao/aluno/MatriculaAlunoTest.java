package br.cleanarchitecture.escola.aplicacao.aluno;

import br.cleanarchitecture.escola.dominio.aluno.Aluno;
import br.cleanarchitecture.escola.dominio.aluno.CPF;
import br.cleanarchitecture.escola.infra.aluno.EmMemoriaAlunoRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaAlunoTest {

    @Test
    public void deveMatricularAlunoComSucesso() {
        EmMemoriaAlunoRepository emMemoriaAlunoRepository = new EmMemoriaAlunoRepository();

        MatriculaAluno matriculaAluno = new MatriculaAluno(emMemoriaAlunoRepository);
        matriculaAluno.matricula(new MatriculaAlunoDTO("287.443.960-66", "Aluno", "aluno@gmail.com"));

        Aluno aluno = emMemoriaAlunoRepository.buscaPorCpf(new CPF("287.443.960-66"));

        assertEquals("287.443.960-66", aluno.getCpf());
        assertEquals("Aluno", aluno.getNome());
        assertEquals("aluno@gmail.com", aluno.getEmail());
    }
}