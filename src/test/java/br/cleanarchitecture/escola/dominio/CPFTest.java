package br.cleanarchitecture.escola.dominio;

import br.cleanarchitecture.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    public void naoDeveCriarCpfComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("numero-invalido"));
    }

    @Test
    public void deveCriarCpfComNumeroValido() {
        assertDoesNotThrow(() -> new CPF("287.443.960-66"));
    }
}