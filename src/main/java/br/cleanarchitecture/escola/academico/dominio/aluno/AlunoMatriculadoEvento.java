package br.cleanarchitecture.escola.academico.dominio.aluno;

import br.cleanarchitecture.escola.shared.dominio.evento.Evento;
import br.cleanarchitecture.escola.shared.dominio.CPF;
import br.cleanarchitecture.escola.shared.dominio.evento.TipoEvento;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculadoEvento implements Evento {

    private final CPF cpf;
    private final LocalDateTime dataHora;

    public AlunoMatriculadoEvento(CPF cpf) {
        this.cpf = cpf;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    @Override
    public TipoEvento getTipoEvento() {
        return TipoEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> getInformacoes() {
        return Map.of("cpf", cpf);
    }

    public CPF getCpf() {
        return cpf;
    }
}
