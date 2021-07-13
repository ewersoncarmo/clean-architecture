package br.cleanarchitecture.escola.academico.dominio;

import br.cleanarchitecture.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void naoDeveCriarEmailComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("email-invalido"));
    }

    @Test
    public void deveCriarEmailComEnderecoValido() {
        assertDoesNotThrow(() -> new Email("aluno@gmail.com"));
    }
}