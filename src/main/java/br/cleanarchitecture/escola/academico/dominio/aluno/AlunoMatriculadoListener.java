package br.cleanarchitecture.escola.academico.dominio.aluno;

import br.cleanarchitecture.escola.shared.dominio.evento.Evento;
import br.cleanarchitecture.escola.shared.dominio.evento.Listener;
import br.cleanarchitecture.escola.shared.dominio.evento.TipoEvento;

import java.time.format.DateTimeFormatter;

public class AlunoMatriculadoListener extends Listener {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.getTipoEvento().equals(TipoEvento.ALUNO_MATRICULADO);
    }

    @Override
    protected void processa(Evento evento) {
        AlunoMatriculadoEvento alunoMatriculadoEvento = (AlunoMatriculadoEvento) evento;

        System.out.println(String.format("Aluno com CPF %s matriculado em %s",
                alunoMatriculadoEvento.getCpf(),
                alunoMatriculadoEvento.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
    }
}
