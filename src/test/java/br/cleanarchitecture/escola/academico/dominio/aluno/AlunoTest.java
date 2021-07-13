package br.cleanarchitecture.escola.academico.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void criaAluno() {
        aluno = Aluno.builder()
                .comCpfNomeEmail("287.443.960-66", "Aluno", "aluno@gmail.com")
                .build();
    }

    @Test
    void deveCriarUmTelefone() {
        aluno.adicionaTelefone("11", "12345678");
        assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    void deveCriarDoisTelefones() {
        aluno.adicionaTelefone("11", "12345678");
        aluno.adicionaTelefone("11", "87654321");
        assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    void naoDeveCriarTresTelefones() {
        assertThrows(IllegalArgumentException.class, () -> {
            aluno.adicionaTelefone("11", "12345678");
            aluno.adicionaTelefone("11", "87654321");
            aluno.adicionaTelefone("11", "14725836");
        });
    }
}