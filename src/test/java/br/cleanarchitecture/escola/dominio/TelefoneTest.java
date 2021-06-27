package br.cleanarchitecture.escola.dominio;

import br.cleanarchitecture.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveCriarTelefoneComDddInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "123456789"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveCriarTelefoneComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,() -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "1234567"));
    }

    @Test
    void deveCriarTelefoneComDddENumeroInvalido() {
        assertDoesNotThrow(() -> new Telefone("11", "12345678"));
        assertDoesNotThrow(() -> new Telefone("11", "123456789"));
    }
}